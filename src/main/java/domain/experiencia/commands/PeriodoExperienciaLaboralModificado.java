package domain.experiencia.commands;

import co.com.sofka.domain.generic.Command;
import domain.experiencia.values.IdExperiencia;
import domain.experiencia.values.IdExperienciaLaboral;
import domain.genericos.Periodo;

public class PeriodoExperienciaLaboralModificado extends Command {
    private final IdExperiencia idExperiencia;
    private final IdExperienciaLaboral idExperienciaLaboral;
    private final Periodo periodo;

    public PeriodoExperienciaLaboralModificado(IdExperiencia idExperiencia, IdExperienciaLaboral idExperienciaLaboral, Periodo periodo) {
        this.idExperiencia = idExperiencia;
        this.idExperienciaLaboral = idExperienciaLaboral;
        this.periodo = periodo;
    }

    public IdExperiencia getIdExperiencia() {
        return idExperiencia;
    }

    public IdExperienciaLaboral getIdExperienciaLaboral() {
        return idExperienciaLaboral;
    }

    public Periodo getPeriodo() {
        return periodo;
    }
}
