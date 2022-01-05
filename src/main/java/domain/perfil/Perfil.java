package domain.perfil;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.perfil.values.*;

import java.util.HashSet;
import java.util.Set;

public class Perfil extends AggregateEvent<IdPerfil> {
    protected IdHojaDeVida idHojaDeVida;
    protected InformacionDeContacto informacionDeContacto;
    protected FotoDePerfil fotoDePerfil;
    protected Set<Referencia> referencias;

    public Perfil(IdPerfil entityId, IdHojaDeVida idHojaDeVida, InformacionDeContacto informacionDeContacto, FotoDePerfil fotoDePerfil) {
        super(entityId);
        this.idHojaDeVida = idHojaDeVida;
        this.informacionDeContacto = informacionDeContacto;
        this.fotoDePerfil = fotoDePerfil;
        this.referencias = new HashSet<>();
    }

    // COMPORTAMIENTOS
    public void agregarNuevaReferencia(){

    }

    public void eliminarReferencia(){

    }

    public void actualizarInformacionDeContacto(){

    }

    public void actualizarNombreCompletoReferencia(){

    }

    public void actualizarInformacionDeContactoReferencia(){

    }

    // RETORNAR LOS ATRIBUTOS
    public Perfil(IdPerfil entityId) {
        super(entityId);
    }

    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public InformacionDeContacto informacionDeContacto() {
        return informacionDeContacto;
    }

    public FotoDePerfil fotoDePerfil() {
        return fotoDePerfil;
    }

    public Set<Referencia> referencias() {
        return referencias;
    }
}
