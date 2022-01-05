package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.NombreCompleto;

public class NombreCompletoModificado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    public NombreCompletoModificado(NombreCompleto nombreCompleto) {
        super("sofkau.domain.colaborador.nombrecompletomodificado");
        this.nombreCompleto = nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
