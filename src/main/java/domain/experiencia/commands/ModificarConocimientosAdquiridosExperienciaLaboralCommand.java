package domain.experiencia.commands;

import co.com.sofka.domain.generic.Command;
import domain.experiencia.values.ConocimientosAdquiridos;
import domain.experiencia.values.IdExperiencia;
import domain.experiencia.values.IdExperienciaLaboral;

public class ModificarConocimientosAdquiridosExperienciaLaboralCommand extends Command {
    private final IdExperiencia idExperiencia;
    private final IdExperienciaLaboral idExperienciaLaboral;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ModificarConocimientosAdquiridosExperienciaLaboralCommand(IdExperiencia idExperiencia, IdExperienciaLaboral idExperienciaLaboral, ConocimientosAdquiridos conocimientosAdquiridos) {
        this.idExperiencia = idExperiencia;
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public IdExperiencia getIdExperiencia() {
        return idExperiencia;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
