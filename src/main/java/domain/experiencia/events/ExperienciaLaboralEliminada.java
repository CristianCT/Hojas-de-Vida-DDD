package domain.experiencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.experiencia.values.IdExperienciaLaboral;

public class ExperienciaLaboralEliminada extends DomainEvent {
    private final IdExperienciaLaboral idExperienciaLaboral;

    public ExperienciaLaboralEliminada(IdExperienciaLaboral idExperienciaLaboral) {
        super("sofkau.domain.experiencia.experiencialaboraleliminada");
        this.idExperienciaLaboral = idExperienciaLaboral;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }
}
