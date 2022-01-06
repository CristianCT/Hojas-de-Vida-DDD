package domain.colaborador;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.events.*;
import domain.colaborador.values.*;
import domain.genericos.NombreCompleto;
import domain.hojadevida.values.IdHojaDeVida;
import domain.perfil.values.IdPerfil;

import java.util.List;

public class Colaborador extends AggregateEvent<IdColaborador> {
    protected IdHojaDeVida idHojaDeVida;
    protected FechaDeNacimiento fechaDeNacimiento;
    protected NombreCompleto nombreCompleto;
    protected Cedula cedula;
    protected Genero genero;
    protected Area area;
    protected IdPerfil idPerfil;

    public Colaborador(IdColaborador entityId, IdHojaDeVida idHojaDeVida, FechaDeNacimiento fechaDeNacimiento, NombreCompleto nombreCompleto, Cedula cedula, Genero genero, Area area) {
        super(entityId);
        subscribe(new ColaboradorChange(this));
        appendChange(new ColaboradorCreado(idHojaDeVida, fechaDeNacimiento, nombreCompleto, cedula, genero, area)).apply();
    }

    private Colaborador(IdColaborador idColaborador) {
        super(idColaborador);
        subscribe(new ColaboradorChange(this));
    }

    public static Colaborador from(IdColaborador idColaborador, List<DomainEvent> retrieveEvents) {
        var colaborador = new Colaborador(idColaborador);
        retrieveEvents.forEach(colaborador::applyEvent);
        return colaborador;
    }

    // COMPORTAMIENTOS
    public void agregarPerfil(IdPerfil idPerfil){
        appendChange(new PerfilAgregado(idPerfil)).apply();
    }

    public void modificarFechaDeNacimiento(FechaDeNacimiento fechaDeNacimiento){
        appendChange(new FechaDeNacimientoModificada(fechaDeNacimiento)).apply();
    }

    public void modificarNombreCompleto(NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoModificado(nombreCompleto)).apply();
    }

    public void modificarCedula(Cedula cedula){
        appendChange(new CedulaModificada(cedula)).apply();
    }

    public void modificarGenero(Genero genero){
        appendChange(new GeneroModificado(genero)).apply();
    }

    public void modificarArea(Area area){
        appendChange(new AreaModificada(area)).apply();
    }

    //RETORNAR LOS ATRIBUTOS
    public IdHojaDeVida idHojaDeVida() {
        return idHojaDeVida;
    }

    public FechaDeNacimiento fechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public NombreCompleto nombreCompleto() {
        return nombreCompleto;
    }

    public Cedula cedula() {
        return cedula;
    }

    public Genero genero() {
        return genero;
    }

    public Area area() {
        return area;
    }

    public IdPerfil idPerfil() {
        return idPerfil;
    }
}
