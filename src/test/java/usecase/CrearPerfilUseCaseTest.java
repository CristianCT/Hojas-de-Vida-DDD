package usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.perfil.commands.CrearPerfilCommand;
import domain.perfil.events.PerfilCreado;
import domain.perfil.values.FotoDePerfil;
import domain.hojadevida.values.IdHojaDeVida;
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
        FotoDePerfil fotoDePerfil = new FotoDePerfil("https://www.imagenes.com.co/perfil.png");


        var command = new CrearPerfilCommand(idPerfil, idHojaDeVida, informacionDeContacto, fotoDePerfil);
        var usecase = new CrearPerfilUseCase();


        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow();


        PerfilCreado event = (PerfilCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("email@ejemplo.com", event.getInformacionDeContacto().value().email());
        Assertions.assertEquals("+57 320019009", event.getInformacionDeContacto().value().telefono());
        Assertions.assertEquals("Transversal 70 MZ C Lote 10", event.getInformacionDeContacto().value().direccion());
        Assertions.assertEquals("https://www.imagenes.com.co/perfil.png", event.getFotoDePerfil().value());
    }

    @Test
    public void errorCrearPerfilEmailIncorrecto(){
        IdPerfil idPerfil = IdPerfil.of("xxxx");
        IdHojaDeVida idHojaDeVida = IdHojaDeVida.of("xxxxx");
        InformacionDeContacto informacionDeContacto = new InformacionDeContacto("emailejemplo.com", "+57 320019009", "Transversal 70 MZ C Lote 10");
        FotoDePerfil fotoDePerfil = new FotoDePerfil("https://www-imagenes.com.co/perfil.png");


        var command = new CrearPerfilCommand(idPerfil, idHojaDeVida, informacionDeContacto, fotoDePerfil);
        var usecase = new CrearPerfilUseCase();

        var error = Assertions.assertThrows(BusinessException.class, () -> {
            UseCaseHandler.getInstance()
                    .setIdentifyExecutor(command.getIdPerfil().value())
                    .syncExecutor(usecase, new RequestCommand<>(command))
                    .orElseThrow();
        });

        Assertions.assertEquals("El correo ingresado no es valido", error.getMessage());
    }

    @Test
    public void errorCrearPerfilFormatoFotoDePerfilNoSoportado(){
        IdPerfil idPerfil = IdPerfil.of("xxxx");
        IdHojaDeVida idHojaDeVida = IdHojaDeVida.of("xxxxx");
        InformacionDeContacto informacionDeContacto = new InformacionDeContacto("email@ejemplo.com", "+57 320019009", "Transversal 70 MZ C Lote 10");
        FotoDePerfil fotoDePerfil = new FotoDePerfil("https://www-imagenes.com.co/perfil.svg");


        var command = new CrearPerfilCommand(idPerfil, idHojaDeVida, informacionDeContacto, fotoDePerfil);
        var usecase = new CrearPerfilUseCase();

        var error = Assertions.assertThrows(BusinessException.class, () -> {
            UseCaseHandler.getInstance()
                    .setIdentifyExecutor(command.getIdPerfil().value())
                    .syncExecutor(usecase, new RequestCommand<>(command))
                    .orElseThrow();
        });

        Assertions.assertEquals("El formato de la imagen no es soportado", error.getMessage());
    }
}