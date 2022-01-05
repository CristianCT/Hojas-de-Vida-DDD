package domain.perfil;

import co.com.sofka.domain.generic.Entity;
import domain.genericos.NombreCompleto;
import domain.perfil.values.IdReferencia;
import domain.perfil.values.InformacionDeContacto;

public class Referencia extends Entity<IdReferencia> {
    private InformacionDeContacto informacionDeContacto;
    private NombreCompleto nombreCompleto;

    public Referencia(IdReferencia entityId, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto) {
        super(entityId);
        this.informacionDeContacto = informacionDeContacto;
        this.nombreCompleto = nombreCompleto;
    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){
        this.informacionDeContacto = informacionDeContacto;
    }

    public void actualizarNombreCompleto(NombreCompleto nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public InformacionDeContacto informacionDeContacto() {
        return informacionDeContacto;
    }

    public NombreCompleto nombreCompleto() {
        return nombreCompleto;
    }
}
