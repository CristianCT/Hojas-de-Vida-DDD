package domain.experiencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Periodo;

public class PeriodoExperienciaLaboralModificado extends DomainEvent {
    private final IdExperienciaLaboral idExperienciaLaboral;
    private final Periodo periodo;

    public PeriodoExperienciaLaboralModificado(IdExperienciaLaboral idExperienciaLaboral, Periodo periodo) {
        super("sofkau.domain.experiencia.periodoexperiencialaboralmodificado");
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.periodo = periodo;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
