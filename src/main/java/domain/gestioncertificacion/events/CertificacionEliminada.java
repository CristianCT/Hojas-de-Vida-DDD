package domain.gestioncertificacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.gestioncertificacion.values.IdCertificacion;

public class CertificacionEliminada extends DomainEvent {
    private final IdCertificacion idCertificacion;

    public CertificacionEliminada(IdCertificacion idCertificacion) {
        super("sofkau.domain.gestioncertificacion.certificacioneliminada");
        this.idCertificacion = idCertificacion;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }
}
