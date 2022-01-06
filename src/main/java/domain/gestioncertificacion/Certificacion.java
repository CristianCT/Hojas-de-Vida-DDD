package domain.gestioncertificacion;

import co.com.sofka.domain.generic.Entity;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.genericos.Institucion;
import domain.gestioncertificacion.values.Nombre;
import domain.genericos.Periodo;

import java.util.Objects;

public class Certificacion extends Entity<IdCertificacion> {
    private Nombre nombre;
    private Institucion institucion;
    private Periodo periodo;

    public Certificacion(IdCertificacion entityId, Nombre nombre, Institucion institucion, Periodo periodo) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
        this.periodo = Objects.requireNonNull(periodo, "El periodo no puede ser null");
    }

    public void modificarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
    }

    public void modificarInstitucion(Institucion institucion){
        this.institucion = Objects.requireNonNull(institucion, "La institucion no puede ser null");
    }

    public void modificarPeriodo(Periodo poeriodo){
        this.periodo =  Objects.requireNonNull(periodo, "El periodo no puede ser null");
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
