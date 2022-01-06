package domain.gestioneducacion;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioneducacion.events.*;
import domain.gestioneducacion.values.Estudio;
import domain.gestioneducacion.values.IdEducacion;
import domain.gestioneducacion.values.IdGestionEducacion;
import domain.gestioneducacion.values.Tipo;
import domain.hojadevida.values.IdHojaDeVida;

import java.util.Set;

public class GestionEducacion extends AggregateEvent<IdGestionEducacion> {
    protected IdHojaDeVida idHojaDeVida;
    protected Set<Educacion> educaciones;

    public GestionEducacion(IdGestionEducacion entityId, IdHojaDeVida idHojaDeVida) {
        super(entityId);
        subscribe(new GestionEducacionChange(this));
        appendChange(new GestionEducacionCreada(idHojaDeVida)).apply();
    }

    public void agregarNuevaEducacion(IdEducacion idEducacion, Tipo tipo, Estudio estudio, Institucion institucion, Periodo periodo){
        appendChange(new EducacionAgregada(idEducacion, tipo, estudio, institucion, periodo)).apply();
    }

    public void eliminarEducacion(IdEducacion idEducacion){
        appendChange(new EducacionEliminada(idEducacion));
    }

    public void modificarTipoEducacion(IdEducacion idEducacion, Tipo tipo){
        appendChange(new TipoEducacionModificado(idEducacion, tipo)).apply();
    }

    public void modificarEstudioEducacion(IdEducacion idEducacion, Estudio estudio){
        appendChange(new EstudioEducacionModificado(idEducacion, estudio)).apply();
    }

    public void actualizarPeriodoEducacion(IdEducacion idEducacion, Periodo periodo){
        appendChange(new PeriodoEducacionModificado(idEducacion, periodo)).apply();
    }

    public void modificarInstitucionEducacion(IdEducacion idEducacion, Institucion institucion){
        appendChange(new InstitucionEducacionModificada(idEducacion, institucion)).apply();
    }

    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public Set<Educacion> educaciones() {
        return educaciones;
    }
}
