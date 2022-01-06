package domain.hojadevida;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.hojadevida.events.HojaDeVidaCreada;
import domain.hojadevida.values.IdHojaDeVida;

public class HojaDeVida extends AggregateEvent<IdHojaDeVida> {
    public HojaDeVida(IdHojaDeVida entityId) {
        super(entityId);
        subscribe(new HojaDeVidaChange(this));
        appendChange(new HojaDeVidaCreada());
    }
}
