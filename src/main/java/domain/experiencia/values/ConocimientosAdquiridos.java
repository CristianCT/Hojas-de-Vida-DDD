package domain.experiencia.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ConocimientosAdquiridos implements ValueObject<String> {
    private final String valor;

    public ConocimientosAdquiridos(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor.isBlank()) throw new IllegalArgumentException("El valor no puede estar vacio");
        if (this.valor.length() < 4) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public String value() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConocimientosAdquiridos that = (ConocimientosAdquiridos) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
