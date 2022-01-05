package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.NombreCompleto;
import domain.perfil.values.IdReferencia;
import domain.perfil.values.InformacionDeContacto;

public class NuevaReferenciaAgregada extends DomainEvent {
    private final IdReferencia idReferencia;
    private final InformacionDeContacto informacionDeContacto;
    private final NombreCompleto nombreCompleto;

    public NuevaReferenciaAgregada(IdReferencia idReferencia, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        super("sofkau.domain.perfil.nuevareferenciaagregada");
        this.idReferencia = idReferencia;
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }

    public IdReferencia getIdReferencia() {
        return idReferencia;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
