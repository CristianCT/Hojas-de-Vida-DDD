package domain.gestioncertificacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.genericos.Institucion;
import domain.gestioncertificacion.values.Nombre;
import domain.genericos.Periodo;

public class NuevaCertificacionAgregada extends DomainEvent {
    private final IdCertificacion idCertificacion;
    private final Nombre nombre;
    private final Institucion institucion;
    private final Periodo periodo;

    public NuevaCertificacionAgregada(IdCertificacion idCertificacion, Nombre nombre, Institucion institucion, Periodo periodo) {
        super("sofkau.domain.gestioncertificacion.nuevacertificacionagregada");
        this.idCertificacion = idCertificacion;
        this.nombre = nombre;
        this.institucion = institucion;
        this.periodo = periodo;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
