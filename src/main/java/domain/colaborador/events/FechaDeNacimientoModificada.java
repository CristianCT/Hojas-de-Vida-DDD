package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.FechaDeNacimiento;

public class FechaDeNacimientoModificada extends DomainEvent {
    private final FechaDeNacimiento fechaDeNacimiento;
    public FechaDeNacimientoModificada(FechaDeNacimiento fechaDeNacimiento) {
        super("sofkau.domain.colaborador.fechadenacimientomodificada");
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public FechaDeNacimiento getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
}
