package usecase;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import domain.experiencia.events.ExperienciaCreada;
import domain.experiencia.values.IdExperiencia;
import domain.hojadevida.values.IdHojaDeVida;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usecase.services.SendEmailService;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotificarExperienciaCreadaUseCaseTest {

    @Mock
    SendEmailService sendEmailService;

    @Test
    public void notificarExperienciaCreada(){
        IdHojaDeVida idHojaDeVida = IdHojaDeVida.of("xxxxx");

        var event = new ExperienciaCreada(idHojaDeVida);
        var usecase = new NotificarExperienciaCreadaUseCase();

        event.setAggregateRootId("zzzzz");
        when(sendEmailService.sendByExperiencia(
                IdExperiencia.of(event.aggregateRootId()),
            "Recursoshumanos@gmail.com",
            "Experiencia creada en la hoja de vida " + event.getIdHojaDeVida()
        )).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(sendEmailService);
        usecase.addServiceBuilder(builder);

        var events =  UseCaseHandler.getInstance()
                .syncExecutor(usecase, new TriggeredEvent<>(event))
                .orElseThrow();

        verify(sendEmailService).sendByExperiencia(
                IdExperiencia.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Experiencia creada en la hoja de vida " + event.getIdHojaDeVida()
        );
    }
}