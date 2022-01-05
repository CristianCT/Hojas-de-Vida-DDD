package domain.gestioneducacion;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioneducacion.events.*;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;
import domain.gestioneducacion.values.Tipo;
import domain.perfil.values.IdHojaDeVida;

import java.util.Set;

public class GestionEducacion extends AggregateEvent<IdGestionEducacion> {
    protected IdHojaDeVida idHojaDeVida;
    protected Set<Educacion> educaciones;

    public GestionEducacion(IdGestionEducacion entityId, IdHojaDeVida idHojaDeVida) {
        super(entityId);
        subscribe(new GestionEducacionChange(this));
        appendChange(new GestionEducacionCreada(idHojaDeVida));
    }

    public void agregarNuevaEducacion(IdEducacion idEducacion, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo){
        appendChange(new EducacionAgregada(idEducacion, tipo, estudio, institucion, periodo));
    }

    public void eliminarEducacion(IdEducacion idEducacion){
        appendChange(new EducacionEliminada(idEducacion));
    }

    public void modificarTipoEducacion(IdEducacion idEducacion, Tipo tipo){
        appendChange(new TipoEducacionModificado(idEducacion, tipo));
    }

    public void actualizarPeriodoEducacion(IdEducacion idEducacion, Periodo periodo){
        appendChange(new PeriodoEducacionModificado(idEducacion, periodo));
    }

    public void modificarInstitucionEducacion(IdEducacion idEducacion, Institucion institucion){
        appendChange(new InstitucionEducacionModificada(idEducacion, institucion));
    }

    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public Set<Educacion> educaciones() {
        return educaciones;
    }
}
