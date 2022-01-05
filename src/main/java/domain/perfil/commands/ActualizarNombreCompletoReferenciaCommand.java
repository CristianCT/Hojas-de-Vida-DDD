package domain.perfil.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.NombreCompleto;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.IdReferencia;

public class ActualizarNombreCompletoReferenciaCommand extends Command {
    private final IdPerfil idPerfil;
    private final IdReferencia idReferencia;
    private final NombreCompleto nombreCompleto;

    public ActualizarNombreCompletoReferenciaCommand(IdPerfil idPerfil, IdReferencia idReferencia, NombreCompleto nombreCompleto) {
        this.idPerfil = idPerfil;
        this.idReferencia = idReferencia;
        this.nombreCompleto = nombreCompleto;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
    }

    public IdReferencia getIdReferencia() {
        return idReferencia;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
