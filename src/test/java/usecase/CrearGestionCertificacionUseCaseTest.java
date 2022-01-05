package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.gestioncertificacion.commands.CrearGestionCertificacionCommand;
import domain.gestioncertificacion.events.GestionCertificacionCreado;
import domain.gestioncertificacion.values.IdGestionCertificacion;
import domain.perfil.values.IdHojaDeVida;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CrearGestionCertificacionUseCaseTest {

    @Test
    public void CrearGestionCertificacion(){
        IdGestionCertificacion idGestionCertificacion = IdGestionCertificacion.of("xxxx");
        IdHojaDeVida idHojaDeVida = IdHojaDeVida.of("xxxxx");


        var command = new CrearGestionCertificacionCommand(idGestionCertificacion, idHojaDeVida);
        var usecase = new CrearGestionCertificacionUseCase();


        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow();


        GestionCertificacionCreado event = (GestionCertificacionCreado) events.getDomainEvents();
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("xxxxx", event.getIdHojaDeVida().value());
    }
}