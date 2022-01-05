package domain.experiencia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.experiencia.values.ConocimientosAdquiridos;
import domain.experiencia.values.IdExperienciaLaboral;

public class ConocimientosAdquiridosExperienciaLaboralModificado extends DomainEvent {
    private final IdExperienciaLaboral idExperienciaLaboral;
    private final ConocimientosAdquiridos conocimientosAdquiridos;

    public ConocimientosAdquiridosExperienciaLaboralModificado(IdExperienciaLaboral idExperienciaLaboral, ConocimientosAdquiridos conocimientosAdquiridos) {
        super("sofkau.domain.experiencia.conocimientosadquiridosexperiencialaboralmodificado");
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.conocimientosAdquiridos = conocimientosAdquiridos;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public ConocimientosAdquiridos getConocimientosAdquiridos() {
        return conocimientosAdquiridos;
    }
}
