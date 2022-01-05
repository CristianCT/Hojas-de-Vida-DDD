package domain.experiencia;

import co.com.sofka.domain.generic.EventChange;
import domain.experiencia.events.*;

import java.util.HashSet;

public class ExperienciaChange extends EventChange {
    public ExperienciaChange(Experiencia experiencia) {
        apply((ExperienciaCreada event) -> {
            experiencia.idHojaDeVida = event.getIdHojaDeVida();
            experiencia.experienciaLaboral = new HashSet<>();
        });

        apply((ExperienciaLaboralAgregada event) -> {
            experiencia.experienciaLaboral.add(
                    new ExperienciaLaboral(
                            event.getIdExperienciaLaboral(),
                            event.getInstitucion(),
                            event.getPeriodo(),
                            event.getConocimientosAdquiridos()
                    )
            );
        });

        apply((ExperienciaLaboralEliminada event) -> {
            experiencia.experienciaLaboral.removeIf(experienciaLaboral -> experiencia.equals(event.getIdExperienciaLaboral()));
        });

        apply((PeriodoExperienciaLaboralModificado event) -> {
            experiencia.experienciaLaboral
                    .stream()
                    .filter(experienciaLaboral -> experienciaLaboral.identity().equals(event.getIdExperienciaLaboral()))
                    .forEach(experienciaLaboral -> experienciaLaboral.modificarPeriodo(event.getPeriodo()));
        });

        apply((EntidadExperienciaLaboralModificado event) -> {
            experiencia.experienciaLaboral
                    .stream()
                    .filter(experienciaLaboral -> experienciaLaboral.identity().equals(event.getIdExperienciaLaboral()))
                    .forEach(experienciaLaboral -> experienciaLaboral.modificarEntidad(event.getInstitucion()));
        });

        apply((ConocimientosAdquiridosExperienciaLaboralModificado event) -> {
            experiencia.experienciaLaboral
                    .stream()
                    .filter(experienciaLaboral -> experienciaLaboral.identity().equals(event.getIdExperienciaLaboral()))
                    .forEach(experienciaLaboral -> experienciaLaboral.modificarConocimientosAdquiridos(event.getConocimientosAdquiridos()));
        });
    }
}
