package domain.hojadevida.commands;

import co.com.sofka.domain.generic.Command;
import domain.hojadevida.values.IdHojaDeVida;

public class CrearHojaDeVidaCommand extends Command {
    private final IdHojaDeVida idHojaDeVida;

    public CrearHojaDeVidaCommand(IdHojaDeVida idHojaDeVida) {
        this.idHojaDeVida = idHojaDeVida;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
