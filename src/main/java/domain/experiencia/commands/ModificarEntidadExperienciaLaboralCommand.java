package domain.experiencia.commands;

import co.com.sofka.domain.generic.Command;
import domain.experiencia.values.IdExperiencia;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Institucion;

public class ModificarEntidadExperienciaLaboralCommand extends Command {
    private final IdExperiencia idExperiencia;
    private final IdExperienciaLaboral idExperienciaLaboral;
    private final Institucion institucion;

    public ModificarEntidadExperienciaLaboralCommand(IdExperiencia idExperiencia, IdExperienciaLaboral idExperienciaLaboral, Institucion institucion) {
        this.idExperiencia = idExperiencia;
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.institucion = institucion;
    }

    public IdExperiencia getIdExperiencia() {
        return idExperiencia;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
