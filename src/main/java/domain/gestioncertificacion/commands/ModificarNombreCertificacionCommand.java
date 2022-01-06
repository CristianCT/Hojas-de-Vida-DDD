package domain.gestioncertificacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.gestioncertificacion.values.IdGestionCertificacion;
import domain.gestioncertificacion.values.Nombre;

public class ModificarNombreCertificacionCommand extends Command {
    private final IdGestionCertificacion idGestionCertificacion;
    private final IdCertificacion idCertificacion;
    private final Nombre nombre;

    public ModificarNombreCertificacionCommand(IdGestionCertificacion idGestionCertificacion, IdCertificacion idCertificacion, Nombre nombre) {
        this.idGestionCertificacion = idGestionCertificacion;
        this.idCertificacion = idCertificacion;
        this.nombre = nombre;
    }

    public IdGestionCertificacion getIdGestionCertificacion() {
        return idGestionCertificacion;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
