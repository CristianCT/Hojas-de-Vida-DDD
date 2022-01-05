package domain.gestioneducacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;

public class EliminarEducacionCommand extends Command {
    private final IdGestionEducacion idGestionEducacion;
    private final IdEducacion idEducacion;

    public EliminarEducacionCommand(IdGestionEducacion idGestionEducacion, IdEducacion idEducacion) {
        this.idGestionEducacion = idGestionEducacion;
        this.idEducacion = idEducacion;
    }

    public IdGestionEducacion getIdGestionEducacion() {
        return idGestionEducacion;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }
}
