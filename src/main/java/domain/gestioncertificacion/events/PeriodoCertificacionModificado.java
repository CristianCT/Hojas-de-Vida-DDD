package domain.gestioncertificacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Periodo;
import domain.gestioncertificacion.values.IdCertificacion;

public class PeriodoCertificacionModificado extends DomainEvent {
    private final IdCertificacion idCertificacion;
    private final Periodo periodo;

    public PeriodoCertificacionModificado(IdCertificacion idCertificacion, Periodo periodo) {
        super("sofkau.domain.gestioncertificacion.periodocertificacionmodificado");
        this.idCertificacion = idCertificacion;
        this.periodo = periodo;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
