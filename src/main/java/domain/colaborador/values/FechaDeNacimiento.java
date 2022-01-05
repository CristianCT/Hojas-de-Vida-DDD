package domain.colaborador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public class FechaDeNacimiento implements ValueObject<LocalDate> {
    private final LocalDate valor;

    public FechaDeNacimiento(LocalDate valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor.isAfter(LocalDate.now())) throw new IllegalArgumentException("La fecha no puede estar despues de la fecha actual");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaDeNacimiento that = (FechaDeNacimiento) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public LocalDate value() {
        return valor;
    }
}
