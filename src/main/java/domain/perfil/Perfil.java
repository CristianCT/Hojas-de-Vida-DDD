package domain.perfil;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.colaborador.values.NombreCompleto;
import domain.perfil.events.*;
import domain.perfil.values.*;

import java.util.Set;

public class Perfil extends AggregateEvent<IdPerfil> {
    protected IdHojaDeVida idHojaDeVida;
    protected InformacionDeContacto informacionDeContacto;
    protected FotoDePerfil fotoDePerfil;
    protected Set<Referencia> referencias;

    public Perfil(IdPerfil entityId, IdHojaDeVida idHojaDeVida, InformacionDeContacto informacionDeContacto, FotoDePerfil fotoDePerfil) {
        super(entityId);
        subscribe(new PerfilChange(this));
        appendChange(new PerfilCreado(idHojaDeVida, informacionDeContacto, fotoDePerfil));
    }

    // COMPORTAMIENTOS
    public void agregarNuevaReferencia(IdReferencia idReferencia, InformacionDeContacto informacionDeContacto, NombreCompleto nombreCompleto){
        appendChange(new NuevaReferenciaAgregada(idReferencia, informacionDeContacto, nombreCompleto));
    }

    public void eliminarReferencia(IdReferencia idReferencia){
        appendChange(new ReferenciaEliminada(idReferencia));
    }

    public void actualizarInformacionDeContacto(InformacionDeContacto informacionDeContacto){
        appendChange(new InformacionDeContactoActualizada(informacionDeContacto));
    }

    public void actualizarNombreCompletoReferencia(IdReferencia idReferencia, NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoReferenciaActualizado(idReferencia, nombreCompleto));
    }

    public void actualizarInformacionDeContactoReferencia(IdReferencia idReferencia, InformacionDeContacto informacionDeContacto){
        appendChange(new InformacionContactoReferenciaActualizada(idReferencia, informacionDeContacto));
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
