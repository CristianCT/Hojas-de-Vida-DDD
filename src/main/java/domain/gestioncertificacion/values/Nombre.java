package domain.gestioncertificacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String valor;

    public Nombre(String nombre) {
        this.valor = Objects.requireNonNull(nombre, "El valor no puede ser null");
        if (this.valor.isBlank()) throw new IllegalArgumentException("El valor no puede estar vacio");
        if (this.valor.length() < 3) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre1 = (Nombre) o;
        return Objects.equals(valor, nombre1.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
