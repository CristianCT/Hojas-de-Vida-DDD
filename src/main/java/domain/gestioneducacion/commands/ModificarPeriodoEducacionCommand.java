package domain.gestioneducacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.Periodo;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;

public class ModificarPeriodoEducacionCommand extends Command {
    private final IdGestionEducacion idGestionEducacion;
    private final IdEducacion idEducacion;
    private final Periodo periodo;

    public ModificarPeriodoEducacionCommand(IdGestionEducacion idGestionEducacion, IdEducacion idEducacion, Periodo periodo) {
        this.idGestionEducacion = idGestionEducacion;
        this.idEducacion = idEducacion;
        this.periodo = periodo;
    }

    public IdGestionEducacion getIdGestionEducacion() {
        return idGestionEducacion;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
