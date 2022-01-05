package domain.gestioncertificacion;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.gestioncertificacion.values.IdGestionCertificacion;
import domain.perfil.values.IdHojaDeVida;

import java.util.Set;

public class GestionCertificacion extends AggregateEvent<IdGestionCertificacion> {
    protected IdHojaDeVida idHojaDeVida;
    protected Set<Certificacion> certificacion;

    public GestionCertificacion(IdGestionCertificacion entityId, IdHojaDeVida idHojaDeVida) {
        super(entityId);
    }

    public void agregarNuevaCertificacion(){

    }

    public void eliminarCertificacion(){

    }

    public void modificarNombreCertificacion(){

    }

    public void modificarInstitucionCertificacion(){

    }

    public void modificarPeriodoCertificacion(){

    }

    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public Set<Certificacion> certificacion() {
        return certificacion;
    }
}
