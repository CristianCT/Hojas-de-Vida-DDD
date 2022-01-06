package usecase;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import domain.experiencia.values.IdExperiencia;
import domain.hojadevida.events.HojaDeVidaCreada;
import domain.hojadevida.values.IdHojaDeVida;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usecase.services.SendEmailService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotificarHojaDeVidaCreadaUseCaseTest {

    @Mock
    SendEmailService sendEmailService;

    @Test
    public void notificarHojaDeVidaCreada(){


        var event = new HojaDeVidaCreada();
        var usecase = new NotificarHojaDeVidaCreadaUseCase();

        event.setAggregateRootId("xxxxxx");
        when(sendEmailService.sendByHojaDeVida(
                IdHojaDeVida.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Se creo la hoja de vida con ID " + event.aggregateRootId()
        )).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(sendEmailService);
        usecase.addServiceBuilder(builder);

        var events =  UseCaseHandler.getInstance()
                .syncExecutor(usecase, new TriggeredEvent<>(event))
                .orElseThrow();

        verify(sendEmailService).sendByHojaDeVida(
                IdHojaDeVida.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Se creo la hoja de vida con ID " + event.aggregateRootId()
        );
    }
}