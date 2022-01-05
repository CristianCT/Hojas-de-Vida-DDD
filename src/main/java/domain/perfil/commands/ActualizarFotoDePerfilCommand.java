package domain.perfil.commands;

import co.com.sofka.domain.generic.Command;
import domain.perfil.values.FotoDePerfil;
import domain.perfil.values.IdPerfil;

public class ActualizarFotoDePerfilCommand extends Command {
    private final IdPerfil idPerfil;
    private final FotoDePerfil fotoDePerfil;

    public ActualizarFotoDePerfilCommand(IdPerfil idPerfil, FotoDePerfil fotoDePerfil) {
        this.idPerfil = idPerfil;
        this.fotoDePerfil = fotoDePerfil;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
    }

    public FotoDePerfil getFotoDePerfil() {
        return fotoDePerfil;
    }
}
