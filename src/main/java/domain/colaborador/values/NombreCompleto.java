package domain.colaborador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCompleto implements ValueObject<NombreCompleto.Properties> {
    private final String nombre;
    private final String apellido;

    public NombreCompleto(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        if (this.nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede estar vacio");
        if(this.nombre.length() < 3) throw new IllegalArgumentException("El nombre no es valido");

        this.apellido = Objects.requireNonNull(apellido, "El apellido no puede ser null");
        if (this.apellido.isBlank()) throw new IllegalArgumentException("El apellido no puede estar vacio");
        if (this.apellido.length() < 3) throw new IllegalArgumentException("El apellido no es valido");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreCompleto that = (NombreCompleto) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    public interface Properties {
        String nombre();
        String apellido();
    }
}
