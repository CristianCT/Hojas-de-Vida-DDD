package domain.gestioncertificacion;

import co.com.sofka.domain.generic.EventChange;
import domain.gestioncertificacion.events.CertificacionEliminada;
import domain.gestioncertificacion.events.GestionCertificacionCreado;
import domain.gestioncertificacion.events.NuevaCertificacionAgregada;

import java.util.HashSet;

public class GestionCertificacionChange extends EventChange {
    public GestionCertificacionChange (GestionCertificacion gestionCertificacion) {
        apply((GestionCertificacionCreado event) -> {
            gestionCertificacion.idHojaDeVida = event.getIdHojaDeVida();
            gestionCertificacion.certificaciones = new HashSet<>();
        });

        apply((NuevaCertificacionAgregada event) -> {
            gestionCertificacion.certificaciones.add(
                new Certificacion(
                        event.getIdCertificacion(),
                        event.getNombre(),
                        event.getInstitucion(),
                        event.getPeriodo()
                )
            );
        });

        apply((CertificacionEliminada event) -> {
            gestionCertificacion.certificaciones.removeIf(certificacion -> certificacion.identity().equals(event.getIdCertificacion()));
        });
    }
}
