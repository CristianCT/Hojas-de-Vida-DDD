package domain.gestioncertificacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioncertificacion.values.IdGestionCertificacion;
import domain.perfil.values.IdHojaDeVida;

public class CrearCertificacionCommand extends Command {
    private final IdGestionCertificacion idGestionCertificacion;
    private final IdHojaDeVida idHojaDeVida;

    public CrearCertificacionCommand(IdGestionCertificacion idGestionCertificacion, IdHojaDeVida idHojaDeVida) {
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
