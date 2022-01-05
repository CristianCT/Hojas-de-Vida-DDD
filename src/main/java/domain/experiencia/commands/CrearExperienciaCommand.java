package domain.experiencia.commands;

import co.com.sofka.domain.generic.Command;
import domain.experiencia.values.IdExperiencia;
import domain.perfil.values.IdHojaDeVida;

public class CrearExperienciaCommand extends Command {
    private final IdExperiencia idExperiencia;
    private final IdHojaDeVida idHojaDeVida;

    public CrearExperienciaCommand(IdExperiencia idExperiencia, IdHojaDeVida idHojaDeVida) {
        this.idExperiencia = idExperiencia;
        this.idHojaDeVida = idHojaDeVida;
    }

    public IdExperiencia getIdExperiencia() {
        return idExperiencia;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
