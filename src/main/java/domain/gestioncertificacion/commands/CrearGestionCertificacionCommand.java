package domain.gestioncertificacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioncertificacion.values.IdGestionCertificacion;
import domain.hojadevida.values.IdHojaDeVida;

public class CrearGestionCertificacionCommand extends Command {
    private final IdGestionCertificacion idGestionCertificacion;
    private final IdHojaDeVida idHojaDeVida;

    public CrearGestionCertificacionCommand(IdGestionCertificacion idGestionCertificacion, IdHojaDeVida idHojaDeVida) {
        this.idGestionCertificacion = idGestionCertificacion;
        this.idHojaDeVida = idHojaDeVida;
    }

    public IdGestionCertificacion getIdGestionCertificacion() {
        return idGestionCertificacion;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
