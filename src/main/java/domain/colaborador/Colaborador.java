package domain.colaborador;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.colaborador.values.IdColaborador;

public class Colaborador extends AggregateEvent<IdColaborador> {
    

    public Colaborador(IdColaborador entityId) {
        super(entityId);
    }
}
