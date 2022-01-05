package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.Genero;

public class GeneroModificado extends DomainEvent {
    private final Genero genero;
    public GeneroModificado(Genero genero) {
        super("sofkau.domain.colaborador.generomodificado");
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }
}
