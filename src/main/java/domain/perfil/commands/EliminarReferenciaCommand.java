package domain.perfil.commands;

import co.com.sofka.domain.generic.Command;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.IdReferencia;

public class EliminarReferenciaCommand extends Command {
    private final IdPerfil idPerfil;
    private final IdReferencia idReferencia;

    public EliminarReferenciaCommand(IdPerfil idPerfil, IdReferencia idReferencia) {
        this.idPerfil = idPerfil;
        this.idReferencia = idReferencia;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
    }

    public IdReferencia getIdReferencia() {
        return idReferencia;
    }
}
