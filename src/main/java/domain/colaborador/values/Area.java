package domain.colaborador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Area implements ValueObject<String> {
    private final String valor;

    public Area(String valor) {
        this.valor = Objects.requireNonNull(valor);
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
        Area area = (Area) o;
        return Objects.equals(valor, area.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
