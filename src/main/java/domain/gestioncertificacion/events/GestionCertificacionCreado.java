package domain.gestioncertificacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.IdHojaDeVida;

public class GestionCertificacionCreado extends DomainEvent {
    private final IdHojaDeVida idHojaDeVida;

    public GestionCertificacionCreado(IdHojaDeVida idHojaDeVida) {
        super("sofkau.domain.gestioncertificacion.gestioncertificacioncreado");
        this.idHojaDeVida = idHojaDeVida;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
