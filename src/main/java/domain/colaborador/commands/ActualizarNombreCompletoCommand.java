package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.IdColaborador;
import domain.genericos.NombreCompleto;

public class ActualizarNombreCompletoCommand extends Command {
    private final IdColaborador idColaborador;
    private final NombreCompleto nombreCompleto;

    public ActualizarNombreCompletoCommand(IdColaborador idColaborador, NombreCompleto nombreCompleto) {
        this.idColaborador = idColaborador;
        this.nombreCompleto = nombreCompleto;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }
}
