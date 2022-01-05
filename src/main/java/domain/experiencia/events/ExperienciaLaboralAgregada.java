package domain.experiencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.experiencia.values.ConocimientosAdquiridos;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Institucion;
import domain.genericos.Periodo;

public class ExperienciaLaboralAgregada extends DomainEvent {

    private final IdExperienciaLaboral idExperienciaLaboral;
    private final Institucion institucion;
    private final Periodo periodo;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ExperienciaLaboralAgregada(IdExperienciaLaboral idExperienciaLaboral, Institucion institucion, Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos) {
        super("sofkau.domain.experiencia.experiencialaboralagregada");
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.institucion = institucion;
        this.periodo = periodo;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
