package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.perfil.commands.CrearPerfilCommand;
import domain.perfil.events.PerfilCreado;
import domain.perfil.values.FotoDePerfil;
import domain.perfil.values.IdHojaDeVida;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.InformacionDeContacto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearPerfilUseCaseTest {

    @Test
    public void crearPerfil(){
        IdPerfil idPerfil = IdPerfil.of("xxxx");
        IdHojaDeVida idHojaDeVida = IdHojaDeVida.of("xxxxx");
        InformacionDeContacto informacionDeContacto = new InformacionDeContacto("email@ejemplo.com", "+57 320019009", "Transversal 70 MZ C Lote 10");
        FotoDePerfil fotoDePerfil = new FotoDePerfil("https://www-imagenes.com.co/perfil.png");


        var command = new CrearPerfilCommand(idPerfil, idHojaDeVida, informacionDeContacto, fotoDePerfil);
        var usecase = new CrearPerfilUseCase();


        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow();


        PerfilCreado event = (PerfilCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("email@ejemplo.com", event.getInformacionDeContacto().value().email());
    }
}