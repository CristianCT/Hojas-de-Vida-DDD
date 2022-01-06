package domain.gestioncertificacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.Institucion;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.gestioncertificacion.values.IdGestionCertificacion;

public class ModificarInstitucionCertificacionCommand extends Command {
    private final IdGestionCertificacion idGestionCertificacion;
    private final IdCertificacion idCertificacion;
    private final Institucion institucion;

    public ModificarInstitucionCertificacionCommand(IdGestionCertificacion idGestionCertificacion, IdCertificacion idCertificacion, Institucion institucion) {
        this.idGestionCertificacion = idGestionCertificacion;
        this.idCertificacion = idCertificacion;
        this.institucion = institucion;
    }

    public IdGestionCertificacion getIdGestionCertificacion() {
        return idGestionCertificacion;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
