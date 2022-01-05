package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.NombreCompleto;

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
