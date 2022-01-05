package usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import domain.experiencia.events.ExperienciaCreada;
import domain.experiencia.values.IdExperiencia;
import usecase.services.SendEmailService;

import java.util.List;

public class NotificarExperienciaCreadaUseCase extends UseCase<TriggeredEvent<ExperienciaCreada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<ExperienciaCreada> triggeredEvent) {
        var event = triggeredEvent.getDomainEvent();

        var service = getService(SendEmailService.class).orElseThrow();
        boolean isValid = service.sendByExperiencia(
                IdExperiencia.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Experiencia creada en la hoja de vida " + event.getIdHojaDeVida()
        );

        if (!isValid) throw new BusinessException(event.aggregateRootId(), "No se logró enviar el correo");

        emit().onResponse(new ResponseEvents(List.of()));

    }
}
