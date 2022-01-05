package domain.gestioneducacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Periodo;
import domain.gestioneducacion.values.IdEducacion;

public class PeriodoEducacionModificado extends DomainEvent {
    private final IdEducacion idEducacion;
    private final Periodo periodo;

    public PeriodoEducacionModificado(IdEducacion idEducacion, Periodo periodo) {
        super("sofkau.domain.gestioneducacion.periodoeducacionmodificado");
        this.idEducacion = idEducacion;
        this.periodo = periodo;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
