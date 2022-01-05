package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.Cedula;
import domain.colaborador.values.IdColaborador;

public class ActualizarIdentificacionCommand extends Command {
    private final IdColaborador idColaborador;
    private final Cedula cedula;

    public ActualizarIdentificacionCommand(IdColaborador idColaborador, Cedula cedula) {
        this.idColaborador = idColaborador;
        this.cedula = cedula;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
