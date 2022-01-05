package domain.gestioncertificacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioncertificacion.values.*;

public class AgregarNuevaCertificacionCommand extends Command {
    private final IdGestionCertificacion idGestionCertificacion;
    private final IdCertificacion idCertificacion;
    private final Nombre nombre;
    private final Institucion institucion;
    private final Periodo periodo;

    public AgregarNuevaCertificacionCommand(IdGestionCertificacion idGestionCertificacion, IdCertificacion idCertificacion, Nombre nombre, Institucion institucion, Periodo periodo) {
        this.idGestionCertificacion = idGestionCertificacion;
        this.idCertificacion = idCertificacion;
        this.nombre = nombre;
        this.institucion = institucion;
        this.periodo = periodo;
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

    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
