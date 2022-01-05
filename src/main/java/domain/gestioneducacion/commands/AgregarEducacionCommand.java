package domain.gestioneducacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;
import domain.gestioneducacion.values.Tipo;

public class AgregarEducacionCommand extends Command {
    private final IdGestionEducacion idGestionEducacion;
    private final IdEducacion idEducacion;
    private final Tipo tipo;
    private final Estudio estudio;
    private final Institucion institucion;
    private final Periodo periodo;

    public AgregarEducacionCommand(IdGestionEducacion idGestionEducacion, IdEducacion idEducacion, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo) {
        this.idGestionEducacion = idGestionEducacion;
        this.idEducacion = idEducacion;
        this.tipo = tipo;
        this.estudio = estudio;
        this.institucion = institucion;
        this.periodo = periodo;
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

    public Estudio getEstudio() {
        return estudio;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
