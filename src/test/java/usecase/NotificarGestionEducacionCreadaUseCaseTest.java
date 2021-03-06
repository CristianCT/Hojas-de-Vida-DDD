package usecase;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import domain.gestioneducacion.events.GestionEducacionCreada;
import domain.gestioneducacion.values.IdGestionEducacion;
import domain.hojadevida.values.IdHojaDeVida;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usecase.services.SendEmailService;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class NotificarGestionEducacionCreadaUseCaseTest {

    @Mock
    SendEmailService sendEmailService;

    @Test
    public void notificarGestionEducacionCreada(){
        IdHojaDeVida idHojaDeVida = IdHojaDeVida.of("xxxxx");

        var event = new GestionEducacionCreada(idHojaDeVida);
        var usecase = new NotificarGestionEducacionCreadaUseCase();

        event.setAggregateRootId("zzzzz");
        when(sendEmailService.sendByGestionEducacion(
                IdGestionEducacion.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Gestion de Educacion creada en la hoja de vida " + event.getIdHojaDeVida()
        )).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(sendEmailService);
        usecase.addServiceBuilder(builder);

        var events =  UseCaseHandler.getInstance()
                .syncExecutor(usecase, new TriggeredEvent<>(event))
                .orElseThrow();

        verify(sendEmailService).sendByGestionEducacion(
                IdGestionEducacion.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Gestion de Educacion creada en la hoja de vida " + event.getIdHojaDeVida()
        );
    }
}