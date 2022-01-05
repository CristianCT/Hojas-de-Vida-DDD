package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.PerfilId;

public class PerfilAgregado extends DomainEvent {
    private final PerfilId perfilId;
    public PerfilAgregado(PerfilId perfilId) {
        super("sofkau.domain.colaborador.perfilagregado");
        this.perfilId = perfilId;
    }

    public PerfilId getPerfilId() {
        return perfilId;
    }
}
