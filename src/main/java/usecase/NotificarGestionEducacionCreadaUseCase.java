package usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import domain.gestioneducacion.events.GestionEducacionCreada;
import domain.gestioneducacion.values.IdGestionEducacion;
import usecase.services.SendEmailService;

import java.util.List;

public class NotificarGestionEducacionCreadaUseCase extends UseCase<TriggeredEvent<GestionEducacionCreada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<GestionEducacionCreada> triggeredEvent) {
        var event = triggeredEvent.getDomainEvent();

        var service = getService(SendEmailService.class).orElseThrow();
        boolean isValid = service.sendByGestionEducacion(
                IdGestionEducacion.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Gestion de Educacion creada en la hoja de vida " + event.getIdHojaDeVida()
        );

        if (!isValid) throw new BusinessException(event.aggregateRootId(), "No se logró enviar el correo");

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
