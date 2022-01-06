package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.IdColaborador;
import domain.perfil.values.IdPerfil;

public class AgregarPerfilCommand extends Command {
    private final IdColaborador idColaborador;
    private final IdPerfil idPerfil;

    public AgregarPerfilCommand(IdColaborador idColaborador, IdPerfil idPerfil) {
        this.idColaborador = idColaborador;
        this.idPerfil = idPerfil;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
    }
}
