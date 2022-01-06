package domain.experiencia;

import co.com.sofka.domain.generic.Entity;
import domain.experiencia.values.ConocimientosAdquiridos;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Institucion;
import domain.genericos.Periodo;

import java.util.Objects;

public class ExperienciaLaboral extends Entity<IdExperienciaLaboral> {
    private Institucion institucion;
    private Periodo periodo;
    private ConocimientosAdquiridos conocimientosAdquiridos;

    public ExperienciaLaboral(IdExperienciaLaboral entityId, Institucion institucion, Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos) {
        super(entityId);
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
        this.conocimientosAdquiridos = Objects.requireNonNull(conocimientosAdquiridos, "Los conocimientos adquiridos no pueden ser null");
    }

    public void modificarEntidad(Institucion institucion){
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
    }

    public void modificarPeriodo(Periodo periodo){
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
    }

    public void modificarConocimientosAdquiridos(ConocimientosAdquiridos conocimientosAdquiridos){
        this.conocimientosAdquiridos = Objects.requireNonNull(conocimientosAdquiridos, "Los conocimientos adquiridos no pueden ser null");
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
