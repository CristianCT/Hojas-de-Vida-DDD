package domain.gestioneducacion;

import co.com.sofka.domain.generic.Entity;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.Tipo;

import java.util.Objects;

public class Educacion extends Entity<IdEducacion> {
    private Tipo tipo;
    private Estudio estudio;
    private Institucion institucion;
    private Periodo periodo;

    public Educacion(IdEducacion entityId, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo) {
        super(entityId);
        this.tipo = Objects.requireNonNull(tipo, "El tipo no puede ser null");
        this.estudio = Objects.requireNonNull(estudio, "El estudio no puede ser null");
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
    }

    public void modificarTipo(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo, "El tipo no puede ser null");
    }

    public void modificarEstudio(Estudio estudio){
        this.estudio = Objects.requireNonNull(estudio, "El estudio no puede ser null");
    }

    public void modificarInstitucion(Institucion institucion){
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
    }

    public void actualizarPeriodo(Periodo periodo){
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
    }

    public Tipo tipo() {
        return tipo;
    }

    public Estudio estudio() {
        return estudio;
    }

    public Institucion institucion() {
        return institucion;
    }

    public Periodo periodo() {
        return periodo;
    }
}
