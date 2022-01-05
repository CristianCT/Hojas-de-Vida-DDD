package domain.gestioneducacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.Institucion;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;

public class ModificarInstitucionEducacionCommand extends Command {
    private final IdGestionEducacion idGestionEducacion;
    private final IdEducacion idEducacion;
    private final Institucion institucion;

    public ModificarInstitucionEducacionCommand(IdGestionEducacion idGestionEducacion, IdEducacion idEducacion, Institucion institucion) {
        this.idGestionEducacion = idGestionEducacion;
        this.idEducacion = idEducacion;
        this.institucion = institucion;
    }

    public IdGestionEducacion getIdGestionEducacion() {
        return idGestionEducacion;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Institucion getInstitucion() {
        return institucion;
    }
}
