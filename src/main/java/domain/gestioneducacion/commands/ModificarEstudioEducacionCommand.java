package domain.gestioneducacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioneducacion.Educacion;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;

public class ModificarEstudioEducacionCommand extends Command {
    private final IdGestionEducacion idGestionEducacion;
    private final IdEducacion idEducacion;
    private final Estudio estudio;

    public ModificarEstudioEducacionCommand(IdEducacion idEducacion, Educacion educacion, IdGestionEducacion idGestionEducacion, Estudio estudio) {
        this.idEducacion = idEducacion;
        this.idGestionEducacion = idGestionEducacion;
        this.estudio = estudio;
    }

    public IdGestionEducacion getIdGestionEducacion() {
        return idGestionEducacion;
    }

    public IdEducacion getIdEducacion() {
        return idEducacion;
    }

    public Estudio getEstudio() {
        return estudio;
    }
}
