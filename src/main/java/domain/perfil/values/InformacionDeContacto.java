package domain.perfil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionDeContacto implements ValueObject<InformacionDeContacto.Properties> {
    private final String email;
    private final String telefono;
    private final String direccion;

    public InformacionDeContacto(String email, String telefono, String direccion) {
        this.email = Objects.requireNonNull(email, "El email no puede ser null");
        if (this.email.isBlank()) throw new IllegalArgumentException("El email no puede estar vacio");
        if (this.email.length() < 3) throw new IllegalArgumentException("EL email es invalido");

        this.telefono = Objects.requireNonNull(telefono, "El telefono no puede ser null");
        if (this.telefono.isBlank()) throw new IllegalArgumentException("El telefono no puede estar vacio");
        if (this.telefono.length() < 3) throw new IllegalArgumentException("EL telefono es invalido");

        this.direccion = Objects.requireNonNull(direccion, "La direccion no puede ser null");
        if (this.direccion.isBlank()) throw new IllegalArgumentException("La direccion no puede estar vacio");
        if (this.direccion.length() < 3) throw new IllegalArgumentException("La direccion es invalido");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String email() {
                return email;
            }

            @Override
            public String telefono() {
                return telefono;
            }

            @Override
            public String direccion() {
                return direccion;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformacionDeContacto that = (InformacionDeContacto) o;
        return Objects.equals(email, that.email) && Objects.equals(telefono, that.telefono) && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, telefono, direccion);
    }

    public interface Properties{
        String email();
        String telefono();
        String direccion();
    }
}
