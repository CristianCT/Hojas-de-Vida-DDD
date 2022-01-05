package domain.gestioneducacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.gestioneducacion.Educacion;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;

public class EstudioEducacionModificado extends DomainEvent {
    private final IdEducacion idEducacion;
    private final Estudio estudio;

    public EstudioEducacionModificado(IdEducacion idEducacion, Educacion educacion, Estudio estudio) {
        super("sofkau.domain.gestioneducacion.estudioeducacionmodificado");
        this.idEducacion = idEducacion;
        this.estudio = estudio;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Estudio getEstudio() {
        return estudio;
    }
}
