package domain.experiencia.commands;

import co.com.sofka.domain.generic.Command;
import domain.experiencia.values.IdExperiencia;
import domain.experiencia.values.IdExperienciaLaboral;

public class EliminarExperienciaLaboralCommand extends Command {
    private final IdExperiencia idExperiencia;
    private final IdExperienciaLaboral idExperienciaLaboral;

    public EliminarExperienciaLaboralCommand(IdExperiencia idExperiencia, IdExperienciaLaboral idExperienciaLaboral) {
        this.idExperiencia = idExperiencia;
        this.idExperienciaLaboral = idExperienciaLaboral;
    }

    public IdExperiencia getIdExperiencia() {
        return idExperiencia;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }
}
