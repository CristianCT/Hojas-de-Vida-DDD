package domain.gestioneducacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.IdHojaDeVida;

public class GestionEducacionCreada extends DomainEvent {
    private final IdHojaDeVida idHojaDeVida;

    public GestionEducacionCreada(IdHojaDeVida idHojaDeVida) {
        super("sofkau.domain.gestioneducacion.gestioneducacioncreada");
        this.idHojaDeVida = idHojaDeVida;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
