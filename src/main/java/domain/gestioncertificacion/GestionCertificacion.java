package domain.gestioncertificacion;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioncertificacion.events.*;
import domain.gestioncertificacion.values.*;
import domain.hojadevida.values.IdHojaDeVida;

import java.util.Set;

public class GestionCertificacion extends AggregateEvent<IdGestionCertificacion> {
    protected IdHojaDeVida idHojaDeVida;
    protected Set<Certificacion> certificaciones;

    public GestionCertificacion(IdGestionCertificacion entityId, IdHojaDeVida idHojaDeVida) {
        super(entityId);
        subscribe(new GestionCertificacionChange(this));
        appendChange(new GestionCertificacionCreado(idHojaDeVida)).apply();
    }

    public void agregarNuevaCertificacion(IdCertificacion idCertificacion, Nombre nombre, Institucion institucion, Periodo periodo){
        appendChange(new NuevaCertificacionAgregada(idCertificacion, nombre, institucion, periodo)).apply();
    }

    public void eliminarCertificacion(IdCertificacion idCertificacion){
        appendChange(new CertificacionEliminada(idCertificacion)).apply();
    }

    public void modificarNombreCertificacion(IdCertificacion idCertificacion, Nombre nombre){
        appendChange(new NombreCertificacionModificado(idCertificacion, nombre)).apply();
    }

    public void modificarInstitucionCertificacion(IdCertificacion idCertificacion, Institucion institucion){
        appendChange(new InstitucionCertificacionModificado(idCertificacion, institucion)).apply();
    }

    public void modificarPeriodoCertificacion(IdCertificacion idCertificacion, Periodo periodo){
        appendChange(new PeriodoCertificacionModificado(idCertificacion, periodo)).apply();
    }

    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public Set<Certificacion> certificaciones() {
        return certificaciones;
    }
}
