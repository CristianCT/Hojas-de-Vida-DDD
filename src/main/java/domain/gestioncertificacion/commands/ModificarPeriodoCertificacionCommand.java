package domain.gestioncertificacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.Periodo;
import domain.gestioncertificacion.values.IdCertificacion;
import domain.gestioncertificacion.values.IdGestionCertificacion;

public class ModificarPeriodoCertificacionCommand extends Command {
    private final IdGestionCertificacion idGestionCertificacion;
    private final IdCertificacion idCertificacion;
    private final Periodo periodo;

    public ModificarPeriodoCertificacionCommand(IdGestionCertificacion idGestionCertificacion, IdCertificacion idCertificacion, Periodo periodo) {
        this.idGestionCertificacion = idGestionCertificacion;
        this.idCertificacion = idCertificacion;
        this.periodo = periodo;
    }

    public IdGestionCertificacion getIdGestionCertificacion() {
        return idGestionCertificacion;
    }

    public IdCertificacion getIdCertificacion() {
        return idCertificacion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
