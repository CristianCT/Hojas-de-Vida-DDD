package domain.gestioneducacion;

import co.com.sofka.domain.generic.EventChange;
import domain.gestioneducacion.events.*;

import java.util.HashSet;

public class GestionEducacionChange extends EventChange {
    public GestionEducacionChange(GestionEducacion gestionEducacion) {
        apply((GestionEducacionCreada event) -> {
            gestionEducacion.idHojaDeVida = event.getIdHojaDeVida();
            gestionEducacion.educaciones = new HashSet<>();
        });

        apply((EducacionAgregada event) -> {
            gestionEducacion.educaciones.add(
                    new Educacion(
                            event.getIdEducacion(),
                            event.getTipo(),
                            event.getEstudio(),
                            event.getInstitucion(),
                            event.getPeriodo()
                    )
            );
        });

        apply((EducacionEliminada event) -> {
            gestionEducacion.educaciones.removeIf(educacion -> educacion.identity().equals(event.getIdEducacion()));
        });

        apply((TipoEducacionModificado event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getIdEducacion()))
                    .forEach(educacion -> educacion.modificarTipo(event.getTipo()));
        });

        apply((EstudioEducacionModificado event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getIdEducacion()))
                    .forEach(educacion -> educacion.modificarEstudio(event.getEstudio()));
        });

        apply((PeriodoEducacionModificado event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getIdEducacion()))
                    .forEach(educacion -> educacion.actualizarPeriodo(event.getPeriodo()));
        });

        apply((InstitucionEducacionModificada event) -> {
            gestionEducacion.educaciones
                    .stream()
                    .filter(educacion -> educacion.identity().equals(event.getIdEducacion()))
                    .forEach(educacion -> educacion.modificarInstitucion(event.getInstitucion()));
        });
    }
}
