package domain.perfil.commands;

import co.com.sofka.domain.generic.Command;
import domain.perfil.values.FotoDePerfil;
import domain.hojadevida.values.IdHojaDeVida;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.InformacionDeContacto;

public class CrearPerfilCommand extends Command {
    private final IdPerfil idPerfil;
    private final IdHojaDeVida idHojaDeVida;
    private final InformacionDeContacto informacionDeContacto;
    private final FotoDePerfil fotoDePerfil;

    public CrearPerfilCommand(IdPerfil idPerfil, IdHojaDeVida idHojaDeVida, InformacionDeContacto informacionDeContacto, FotoDePerfil fotoDePerfil) {
        this.idPerfil = idPerfil;
        this.idHojaDeVida = idHojaDeVida;
        this.informacionDeContacto = informacionDeContacto;
        this.fotoDePerfil = fotoDePerfil;
    }

    public IdPerfil getIdPerfil() {
        return idPerfil;
    }

    public InformacionDeContacto getInformacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoDePerfil getFotoDePerfil() {
        return fotoDePerfil;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
