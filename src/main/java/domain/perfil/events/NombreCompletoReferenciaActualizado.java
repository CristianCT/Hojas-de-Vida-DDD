package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.NombreCompleto;

public class NombreCompletoReferenciaActualizado extends DomainEvent {
    private final NombreCompleto nombreCompleto;

    public NombreCompletoReferenciaActualizado(NombreCompleto nombreCompleto) {
        super("sofkau.domain.perfil.nombrecompletoreferenciaactualizado");
        this.nombreCompleto = nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
