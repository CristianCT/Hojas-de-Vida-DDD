package domain.hojadevida.events;

import co.com.sofka.domain.generic.DomainEvent;

public class HojaDeVidaCreada extends DomainEvent {
    public HojaDeVidaCreada() {
        super("sofkau.domain.hojadevida.hojadevidacreada");
    }
}
