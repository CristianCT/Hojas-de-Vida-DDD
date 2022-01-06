package domain.gestioncertificacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.gestioncertificacion.values.Nombre;

public class NombreCertificacionModificado extends DomainEvent {
    private final IdCertificacion idCertificacion;
    private final Nombre nombre;

    public NombreCertificacionModificado(IdCertificacion idCertificacion, Nombre nombre) {
        super("sofkau.domain.gestioncertificacion.nombrecertificacionmodificado");
        this.idCertificacion = idCertificacion;
        this.nombre = nombre;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
