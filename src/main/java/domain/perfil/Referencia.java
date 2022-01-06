package domain.perfil;

import co.com.sofka.domain.generic.Entity;
import domain.genericos.NombreCompleto;
import domain.perfil.values.IdReferencia;
import domain.perfil.values.InformacionDeContacto;

import java.util.Objects;

public class Referencia extends Entity<IdReferencia> {
    private InformacionDeContacto informacionDeContacto;
    private NombreCompleto nombreCompleto;

    public Referencia(IdReferencia entityId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        super(entityId);
        this.informacionDeContacto = Objects.requireNonNull(informacionDeContacto, "La informacion de contacto no puede ser null");
        this.nombreCompleto = Objects.requireNonNull(nombreCompleto, "El nombre completo no puede ser null");
    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){
        this.informacionDeContacto = Objects.requireNonNull(informacionDeContacto, "La informacion de contacto no puede ser null");
    }

    public void actualizarNombreCompleto(NombreCompleto nombreCompleto){
        this.nombreCompleto = Objects.requireNonNull(nombreCompleto, "El nombre completo no puede ser null");
    }

    public InformacionDeContacto informacionDeContacto() {
        return informacionDeContacto;
    }

    public NombreCompleto nombreCompleto() {
        return nombreCompleto;
    }
}
