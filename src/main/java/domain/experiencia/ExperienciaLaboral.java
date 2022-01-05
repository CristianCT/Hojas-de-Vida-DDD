package domain.experiencia;

import co.com.sofka.domain.generic.Entity;
import domain.experiencia.values.ConocimientosAdquiridos;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Institucion;
import domain.genericos.Periodo;

public class ExperienciaLaboral extends Entity<IdExperienciaLaboral> {
    private Institucion institucion;
    private Periodo periodo;
    private ConocimientosAdquiridos conocimientosAdquiridos;

    public ExperienciaLaboral(IdExperienciaLaboral entityId, Institucion institucion, Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos) {
        super(entityId);
        this.institucion = institucion;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public void modificarEntidad(Institucion institucion){
        this.institucion = institucion;
    }

    public void modificarPeriodo(Periodo periodo){
        this.periodo = periodo;
    }

    public void modificarConocimientosAdquiridos(ConocimientosAdquiridos conocimientosAdquiridos){
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public Institucion institucion() {
        return institucion;
    }

    public Periodo periodo() {
        return periodo;
    }

    public ConocimientosAdquiridos conocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
