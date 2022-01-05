package domain.perfil.commands;

import co.com.sofka.domain.generic.Command;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.InformacionDeContacto;

public class ActualizarInformacionContactoCommand extends Command {
    private final IdPerfil idPerfil;
    private final InformacionDeContacto informacionDeContacto;

    public ActualizarInformacionContactoCommand(IdPerfil idPerfil, InformacionDeContacto informacionDeContacto) {
        this.idPerfil = idPerfil;
        this.informacionDeContacto = informacionDeContacto;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }
}
