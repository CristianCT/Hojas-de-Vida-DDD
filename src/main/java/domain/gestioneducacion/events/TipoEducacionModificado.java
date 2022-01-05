package domain.gestioneducacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.Tipo;

public class TipoEducacionModificado extends DomainEvent {
    private final IdEducacion idEducacion;
    private final Tipo tipo;

    public TipoEducacionModificado(IdEducacion idEducacion, Tipo tipo) {
        super("sofkau.domain.gestioneducacion.tipoeducacionmodificado");
        this.idEducacion = idEducacion;
        this.tipo = tipo;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
