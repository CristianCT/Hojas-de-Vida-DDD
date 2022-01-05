package domain.gestioneducacion;

import co.com.sofka.domain.generic.Entity;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.Tipo;

public class Educacion extends Entity<IdEducacion> {
    private Tipo tipo;
    private Estudio estudio;
    private Institucion institucion;
    private Periodo periodo;

    public Educacion(IdEducacion entityId, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo) {
        super(entityId);
        this.tipo = tipo;
        this.estudio = estudio;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public void modificarTipo(Tipo tipo){
        this.tipo = tipo;
    }

    public void modificarEstudio(Estudio estudio){
        this.estudio = estudio;
    }

    public void modificarInstitucion(Institucion institucion){
        this.institucion = institucion;
    }

    public void actualizarPeriodo(Periodo periodo){
        this.periodo = periodo;
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
