package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.IdReferencia;
import domain.perfil.values.InformacionDeContacto;

public class InformacionContactoReferenciaActualizada extends DomainEvent {
    private final IdReferencia idReferencia;
    private final InformacionDeContacto informacionDeContacto;

    public InformacionContactoReferenciaActualizada(IdReferencia idReferencia, InformacionDeContacto informacionDeContacto) {
        super("sofkau.domain.perfil.informacioncontactoreferenciaactualizada");
        this.idReferencia = idReferencia;
        this.informacionDeContacto = informacionDeContacto;
    }

    public IdReferencia getIdReferencia() {
        return idReferencia;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
