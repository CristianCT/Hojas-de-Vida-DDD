package domain.gestioneducacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.gestioneducacion.values.IdEducacion;

public class EducacionEliminada extends DomainEvent {
    private final IdEducacion idEducacion;

    public EducacionEliminada(IdEducacion idEducacion) {
        super("sofkau.domain.gestioneducacion.educacioneliminada");
        this.idEducacion = idEducacion;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }
}
