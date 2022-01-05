package domain.experiencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Institucion;

public class EntidadExperienciaLaboralModificado extends DomainEvent {
    private final IdExperienciaLaboral idExperienciaLaboral;
    private final Institucion institucion;

    public EntidadExperienciaLaboralModificado(IdExperienciaLaboral idExperienciaLaboral, Institucion institucion) {
        super("sofkau.domain.experiencia.entidadexperiencialaboralmodificado");
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.institucion = institucion;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
