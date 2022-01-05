package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.Cedula;

public class CedulaModificada extends DomainEvent {
    private final Cedula cedula;
    public CedulaModificada(Cedula cedula) {
        super("sofkau.domain.colaborador.cedulamodificada");
        this.cedula = cedula;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
