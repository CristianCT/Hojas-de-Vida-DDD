package domain.perfil.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FotoDePerfil implements ValueObject<String> {
    private final String valor;

    public FotoDePerfil(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor.isBlank()) throw new IllegalArgumentException("El valor no puede estar vacio");
        if (this.valor.length() < 3) throw new IllegalArgumentException("El valor es invalido");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FotoDePerfil that = (FotoDePerfil) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public String value() {
        return valor;
    }
}
