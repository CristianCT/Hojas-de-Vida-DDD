package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.IdReferencia;

public class ReferenciaEliminada extends DomainEvent {
    private final IdReferencia idReferencia;

    public ReferenciaEliminada(IdReferencia idReferencia) {
        super("sofkau.domain.perfil.referenciaeliminada");
        this.idReferencia = idReferencia;
    }

    public IdReferencia getIdReferencia() {
        return idReferencia;
    }
}
