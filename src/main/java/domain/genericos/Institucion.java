package domain.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Institucion implements ValueObject<String> {
    private final String nombre;

    public Institucion(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        if (this.nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede estar vacio");
        if (this.nombre.length() < 3) throw new IllegalArgumentException("El nombre no es valido");
    }

    @Override
    public String value() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Institucion that = (Institucion) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
