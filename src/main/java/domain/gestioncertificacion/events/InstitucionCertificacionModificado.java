package domain.gestioncertificacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Institucion;
import domain.gestioncertificacion.values.IdCertificacion;

public class InstitucionCertificacionModificado extends DomainEvent {
    private final IdCertificacion idCertificacion;
    private final Institucion institucion;

    public InstitucionCertificacionModificado(IdCertificacion idCertificacion, Institucion institucion) {
        super("sofkau.domain.gestioncertificacion.institucioncertificacionmodificado");
        this.idCertificacion = idCertificacion;
        this.institucion = institucion;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
