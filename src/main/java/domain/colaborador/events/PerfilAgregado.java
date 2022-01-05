package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.IdPerfil;

public class PerfilAgregado extends DomainEvent {
    private final IdPerfil idPerfil;
    public PerfilAgregado(IdPerfil idPerfil) {
        super("sofkau.domain.colaborador.perfilagregado");
        this.idPerfil = idPerfil;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
    }
}
