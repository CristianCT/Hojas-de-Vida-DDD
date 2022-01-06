package domain.gestioncertificacion;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.genericos.Institucion;
import domain.genericos.Periodo;
import domain.gestioncertificacion.events.CertificacionEliminada;
import domain.gestioncertificacion.events.GestionCertificacionCreado;
import domain.gestioncertificacion.events.NuevaCertificacionAgregada;
import domain.gestioncertificacion.values.*;
import domain.hojadevida.values.IdHojaDeVida;

import java.util.Set;

public class GestionCertificacion extends AggregateEvent<IdGestionCertificacion> {
    protected IdHojaDeVida idHojaDeVida;
    protected Set<Certificacion> certificaciones;

    public GestionCertificacion(IdGestionCertificacion entityId, IdHojaDeVida idHojaDeVida) {
        super(entityId);
        subscribe(new GestionCertificacionChange(this));
        appendChange(new GestionCertificacionCreado(idHojaDeVida));
    }

    public void agregarNuevaCertificacion(IdCertificacion idCertificacion, Nombre nombre, Institucion institucion, Periodo periodo){
        appendChange(new NuevaCertificacionAgregada(idCertificacion, nombre, institucion, periodo));
    }

    public void eliminarCertificacion(IdCertificacion idCertificacion){
        appendChange(new CertificacionEliminada(idCertificacion));
    }

    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public Set<Certificacion> certificaciones() {
        return certificaciones;
    }
}
