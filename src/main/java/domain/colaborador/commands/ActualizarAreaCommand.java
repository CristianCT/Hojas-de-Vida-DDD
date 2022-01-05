package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.Area;
import domain.colaborador.values.IdColaborador;

public class ActualizarAreaCommand extends Command {
    private final IdColaborador idColaborador;
    private final Area area;

    public ActualizarAreaCommand(IdColaborador idColaborador, Area area) {
        this.idColaborador = idColaborador;
        this.area = area;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public Area getArea() {
        return area;
    }
}
