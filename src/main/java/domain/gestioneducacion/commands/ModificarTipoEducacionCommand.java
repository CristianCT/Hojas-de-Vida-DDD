package domain.gestioneducacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;
import domain.gestioneducacion.values.Tipo;

public class ModificarTipoEducacionCommand extends Command {
    private final IdGestionEducacion idGestionEducacion;
    private final IdEducacion idEducacion;
    private final Tipo tipo;

    public ModificarTipoEducacionCommand(IdGestionEducacion idGestionEducacion, IdEducacion idEducacion, Tipo tipo) {
        this.idGestionEducacion = idGestionEducacion;
        this.idEducacion = idEducacion;
        this.tipo = tipo;
    }

    public IdGestionEducacion getIdGestionEducacion() {
        return idGestionEducacion;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
