package usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import domain.hojadevida.events.HojaDeVidaCreada;
import domain.hojadevida.values.IdHojaDeVida;
import usecase.services.SendEmailService;

import java.util.List;

public class NotificarHojaDeVidaCreadaUseCase extends UseCase<TriggeredEvent<HojaDeVidaCreada>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<HojaDeVidaCreada> triggeredEvent) {
        var event = triggeredEvent.getDomainEvent();

        var service = getService(SendEmailService.class).orElseThrow();
        boolean isValid = service.sendByHojaDeVida(
                IdHojaDeVida.of(event.aggregateRootId()),
                "Recursoshumanos@gmail.com",
                "Se creo la hoja de vida con ID " + event.aggregateRootId()
        );

        if (!isValid) throw new BusinessException(event.aggregateRootId(), "No se logró enviar el correo");

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
