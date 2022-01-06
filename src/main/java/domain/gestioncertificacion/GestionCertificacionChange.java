package domain.gestioncertificacion;

import co.com.sofka.domain.generic.EventChange;
import domain.gestioncertificacion.events.*;

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

        apply((NombreCertificacionModificado event) -> {
            gestionCertificacion.certificaciones
                    .stream()
                    .filter(certificacion -> certificacion.identity().equals(event.getIdCertificacion()))
                    .forEach(certificacion -> certificacion.modificarNombre(event.getNombre()));
        });

        apply((InstitucionCertificacionModificado event) -> {
            gestionCertificacion.certificaciones
                    .stream()
                    .filter(certificacion -> certificacion.identity().equals(event.getIdCertificacion()))
                    .forEach(certificacion -> certificacion.modificarInstitucion(event.getInstitucion()));
        });

        apply((PeriodoCertificacionModificado event) -> {
            gestionCertificacion.certificaciones
                    .stream()
                    .filter(certificacion -> certificacion.identity().equals(event.getIdCertificacion()))
                    .forEach(certificacion -> certificacion.modificarPeriodo(event.getPeriodo()));
        });
    }
}
