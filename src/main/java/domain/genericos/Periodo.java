package domain.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public class Periodo implements ValueObject<Periodo.Properties> {
    private final LocalDateTime fechaInicio;
    private final LocalDateTime fechaFin;

    public Periodo(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.fechaInicio = Objects.requireNonNull(fechaInicio, "La fecha de inicio no puede ser null");
        this.fechaFin = Objects.requireNonNull(fechaFin, "La fecha final no puede ser null");

        if (this.fechaInicio.isAfter(this.fechaFin)) throw new IllegalArgumentException("Las fechas ingresadas son invalidas");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public LocalDateTime fechaInicio() {
                return fechaInicio;
            }

            @Override
            public LocalDateTime fechaFin() {
                return fechaFin;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Periodo periodo = (Periodo) o;
        return Objects.equals(fechaInicio, periodo.fechaInicio) && Objects.equals(fechaFin, periodo.fechaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaInicio, fechaFin);
    }

    public interface Properties{
        LocalDateTime fechaInicio();
        LocalDateTime fechaFin();
    }
}
