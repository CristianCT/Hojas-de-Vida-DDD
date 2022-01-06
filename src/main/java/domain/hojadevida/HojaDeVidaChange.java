package domain.hojadevida;

import co.com.sofka.domain.generic.EventChange;
import domain.hojadevida.events.HojaDeVidaCreada;

public class HojaDeVidaChange extends EventChange {

    public HojaDeVidaChange(HojaDeVida hojaDeVida) {
        apply((HojaDeVidaCreada event) -> {

        });
    }
}
