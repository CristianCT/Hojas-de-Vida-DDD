package domain.perfil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionDeContacto implements ValueObject<InformacionDeContacto.Properties> {
    private final String email;
    private final String telefono;
    private final String direccion;

    public InformacionDeContacto(String email, String telefono, String direccion) {
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
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
