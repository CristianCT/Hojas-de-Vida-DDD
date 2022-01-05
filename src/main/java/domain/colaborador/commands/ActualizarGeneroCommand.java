package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.Genero;
import domain.colaborador.values.IdColaborador;

public class ActualizarGeneroCommand extends Command {
    private final IdColaborador idColaborador;
    private final Genero genero;

    public ActualizarGeneroCommand(IdColaborador idColaborador, Genero genero) {
        this.idColaborador = idColaborador;
        this.genero = genero;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public Genero getGenero() {
        return genero;
    }
}
