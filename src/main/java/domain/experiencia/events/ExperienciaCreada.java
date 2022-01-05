package domain.experiencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.IdHojaDeVida;

public class ExperienciaCreada extends DomainEvent {
    private final IdHojaDeVida idHojaDeVida;

    public ExperienciaCreada(IdHojaDeVida idHojaDeVida) {
        super("sofkau.domain.experiencia.experienciacreada");
        this.idHojaDeVida = idHojaDeVida;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
