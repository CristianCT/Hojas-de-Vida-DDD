package domain.experiencia;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.experiencia.events.*;
import domain.experiencia.values.ConocimientosAdquiridos;
import domain.experiencia.values.IdExperiencia;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.perfil.values.IdHojaDeVida;

import java.util.Set;

public class Experiencia extends AggregateEvent<IdExperiencia> {
    protected IdHojaDeVida idHojaDeVida;
    protected Set<ExperienciaLaboral> experienciaLaboral;


    public Experiencia(IdExperiencia entityId, IdHojaDeVida idHojaDeVida) {
        super(entityId);
        subscribe(new ExperienciaChange(this));
        appendChange(new ExperienciaCreada(idHojaDeVida));
    }

    public void agregarExperienciaLaboral(IdExperienciaLaboral idExperienciaLaboral, Institucion institucion, Periodo periodo, ConocimientosAdquiridos conocimientosAdquiridos){
        appendChange(new ExperienciaLaboralAgregada(idExperienciaLaboral, institucion, periodo, conocimientosAdquiridos));
    }

    public void eliminarExperienciaLaboral(IdExperienciaLaboral idExperienciaLaboral){
        appendChange(new ExperienciaLaboralEliminada(idExperienciaLaboral));
    }

    public void modificarExperienciaLaboralEntidad(IdExperienciaLaboral idExperienciaLaboral, Institucion institucion){
        appendChange(new EntidadExperienciaLaboralModificado(idExperienciaLaboral, institucion));
    }

    public void modificarExperienciaLaboralPeriodo(IdExperienciaLaboral idExperienciaLaboral, Periodo periodo){
        appendChange(new PeriodoExperienciaLaboralModificado(idExperienciaLaboral, periodo));
    }

    public void modificarExperienciaLaboralConocimientosAdquiridos(IdExperienciaLaboral idExperienciaLaboral, ConocimientosAdquiridos conocimientosAdquiridos){
        appendChange(new ConocimientosAdquiridosExperienciaLaboralModificado(idExperienciaLaboral, conocimientosAdquiridos));
    }

    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public Set<ExperienciaLaboral> experienciaLaboral() {
        return experienciaLaboral;
    }

}
