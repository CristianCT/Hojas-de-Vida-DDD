package domain.perfil.commands;

import co.com.sofka.domain.generic.Command;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.IdReferencia;
import domain.perfil.values.InformacionDeContacto;

public class ActualizarInformacionDeContactoReferenciaCommand extends Command {
    private final IdPerfil idPerfil;
    private final IdReferencia idReferencia;
    private final InformacionDeContacto informacionDeContacto;

    public ActualizarInformacionDeContactoReferenciaCommand(IdPerfil idPerfil, IdReferencia idReferencia, InformacionDeContacto informacionDeContacto) {
        this.idPerfil = idPerfil;
        this.idReferencia = idReferencia;
        this.informacionDeContacto = informacionDeContacto;
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
}
