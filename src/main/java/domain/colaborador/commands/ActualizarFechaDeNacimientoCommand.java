package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.FechaDeNacimiento;
import domain.colaborador.values.IdColaborador;

public class ActualizarFechaDeNacimientoCommand extends Command {
    private final IdColaborador idColaborador;
    private final FechaDeNacimiento fechaDeNacimiento;

    public ActualizarFechaDeNacimientoCommand(IdColaborador idColaborador, FechaDeNacimiento fechaDeNacimiento) {
        this.idColaborador = idColaborador;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public FechaDeNacimiento getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}
