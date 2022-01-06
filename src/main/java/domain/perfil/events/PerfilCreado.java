package domain.perfil.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.values.FotoDePerfil;
import domain.hojadevida.values.IdHojaDeVida;
import domain.perfil.values.InformacionDeContacto;

public class PerfilCreado extends DomainEvent {
    private final IdHojaDeVida idHojaDeVida;
    private final InformacionDeContacto informacionDeContacto;
    private final FotoDePerfil fotoDePerfil;

    public PerfilCreado(IdHojaDeVida idHojaDeVida, InformacionDeContacto informacionDeContacto, FotoDePerfil fotoDePerfil) {
        super("sofkau.domain.perfil.perfilcreado");
        this.idHojaDeVida = idHojaDeVida;
        this.informacionDeContacto = informacionDeContacto;
        this.fotoDePerfil = fotoDePerfil;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoDePerfil getFotoDePerfil() {
        return fotoDePerfil;
    }
}
