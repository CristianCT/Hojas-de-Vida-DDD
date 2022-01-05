package domain.perfil.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.NombreCompleto;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.IdReferencia;
import domain.perfil.values.InformacionDeContacto;

public class AgregarNuevaReferenciaCommand extends Command {
    private final IdPerfil idPerfil;
    private final IdReferencia idReferencia;
    private final InformacionDeContacto informacionDeContacto;
    private final NombreCompleto nombreCompleto;

    public AgregarNuevaReferenciaCommand(IdPerfil idPerfil, IdReferencia idReferencia, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        this.idPerfil = idPerfil;
        this.idReferencia = idReferencia;
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
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
