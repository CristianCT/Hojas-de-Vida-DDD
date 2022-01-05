package domain.gestioneducacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.Tipo;

public class EducacionAgregada extends DomainEvent {
    private final IdEducacion idEducacion;
    private final Tipo tipo;
    private final Estudio estudio;
    private final Institucion institucion;
    private final Periodo periodo;

    public EducacionAgregada(IdEducacion idEducacion, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo) {
        super("sofkau.domain.gestioneducacion.educacionagregada");
        this.idEducacion = idEducacion;
        this.tipo = tipo;
        this.estudio = estudio;
        this.institucion = institucion;
        this.periodo = periodo;
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
