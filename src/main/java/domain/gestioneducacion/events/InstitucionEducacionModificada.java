package domain.gestioneducacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Institucion;
import domain.gestioneducacion.values.IdEducacion;

public class InstitucionEducacionModificada extends DomainEvent {
    private final IdEducacion idEducacion;
    private final Institucion institucion;

    public InstitucionEducacionModificada(IdEducacion idEducacion, Institucion institucion) {
        super("sofkau.domain.gestioneducacion.institucioneducacionmodificada");
        this.idEducacion = idEducacion;
        this.institucion = institucion;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
