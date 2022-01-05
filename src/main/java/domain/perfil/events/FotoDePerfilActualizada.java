package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.FotoDePerfil;

public class FotoDePerfilActualizada extends DomainEvent {
    private final FotoDePerfil fotoDePerfil;

    public FotoDePerfilActualizada(FotoDePerfil fotoDePerfil) {
        super("sofkau.domain.perfil.fotodeperfilactualizada");
        this.fotoDePerfil = fotoDePerfil;
    }

    public FotoDePerfil getFotoDePerfil() {
        return fotoDePerfil;
    }
}
