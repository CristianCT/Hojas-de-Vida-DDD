package domain.gestioncertificacion;

import co.com.sofka.domain.generic.Entity;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.gestioncertificacion.values.Institucion;
import domain.gestioncertificacion.values.Nombre;
import domain.gestioncertificacion.values.Periodo;

public class Certificacion extends Entity<IdCertificacion> {
    private Nombre nombre;
    private Institucion institucion;
    private Periodo periodo;

    public Certificacion(IdCertificacion entityId, Nombre nombre, Institucion institucion, Periodo periodo) {
        super(entityId);
        this.nombre = nombre;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void modificarInstitucion(Institucion institucion){
        this.institucion = institucion;
    }

    public void modificarPeriodo(Periodo poeriodo){
        this.periodo = periodo;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Institucion institucion() {
        return institucion;
    }

    public Periodo periodo() {
        return periodo;
    }
}
