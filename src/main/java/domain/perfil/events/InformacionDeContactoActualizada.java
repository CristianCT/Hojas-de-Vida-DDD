package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.InformacionDeContacto;

public class InformacionDeContactoActualizada extends DomainEvent {
    private final InformacionDeContacto informacionDeContacto;

    public InformacionDeContactoActualizada(InformacionDeContacto informacionDeContacto) {
        super("sofkau.domain.perfil.informaciondecontactoatualizada");
        this.informacionDeContacto = informacionDeContacto;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
