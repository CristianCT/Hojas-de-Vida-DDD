package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.NombreCompleto;
import domain.perfil.values.IdReferencia;

public class NombreCompletoReferenciaActualizado extends DomainEvent {
    private final IdReferencia idReferencia;
    private final NombreCompleto nombreCompleto;

    public NombreCompletoReferenciaActualizado(IdReferencia idReferencia, NombreCompleto nombreCompleto) {
        super("sofkau.domain.perfil.nombrecompletoreferenciaactualizado");
        this.idReferencia = idReferencia;
        this.nombreCompleto = nombreCompleto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public IdReferencia getIdReferencia() {
        return idReferencia;
    }
}
