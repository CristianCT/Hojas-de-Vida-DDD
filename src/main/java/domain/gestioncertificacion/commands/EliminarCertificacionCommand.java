package domain.gestioncertificacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.gestioncertificacion.values.IdGestionCertificacion;

public class EliminarCertificacionCommand extends Command {
    private final IdGestionCertificacion idGestionCertificacion;
    private final IdCertificacion idCertificacion;

    public EliminarCertificacionCommand(IdGestionCertificacion idGestionCertificacion, IdCertificacion idCertificacion) {
        this.idGestionCertificacion = idGestionCertificacion;
        this.idCertificacion = idCertificacion;
    }

    public IdGestionCertificacion getIdGestionCertificacion() {
        return idGestionCertificacion;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }
}
