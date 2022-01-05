package domain.colaborador;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.colaborador.events.*;
import domain.colaborador.values.*;

public class Colaborador extends AggregateEvent<IdColaborador> {
    protected HojaDeVidaId hojaDeVidaId;
    protected FechaDeNacimiento fechaDeNacimiento;
    protected NombreCompleto nombreCompleto;
    protected Cedula cedula;
    protected Genero genero;
    protected Area area;
    protected PerfilId perfilId;

    public Colaborador(IdColaborador entityId, HojaDeVidaId hojaDeVidaId, FechaDeNacimiento fechaDeNacimiento, NombreCompleto nombreCompleto, Cedula cedula, Genero genero, Area area) {
        super(entityId);
        subscribe(new ColaboradorChange(this));
        appendChange(new ColaboradorCreado(hojaDeVidaId, fechaDeNacimiento, nombreCompleto, cedula, genero, area));
    }

    // COMPORTAMIENTOS
    public void agregarPerfil(PerfilId perfilId){
        appendChange(new PerfilAgregado(perfilId));
    }

    public void modificarFechaDeNacimiento(FechaDeNacimiento fechaDeNacimiento){
        appendChange(new FechaDeNacimientoModificada(fechaDeNacimiento));
    }

    public void modificarNombreCompleto(NombreCompleto nombreCompleto){
        appendChange(new NombreCompletoModificado(nombreCompleto));
    }

    public void modificarCedula(Cedula cedula){
        appendChange(new CedulaModificada(cedula));
    }

    public void modificarGenero(Genero genero){
        appendChange(new GeneroModificado(genero));
    }

    public void modificarArea(Area area){
        appendChange(new AreaModificada(area));
    }

    //RETORNAR LOS ATRIBUTOS
    public HojaDeVidaId hojaDeVidaId() {
        return hojaDeVidaId;
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

    public PerfilId perfilId() {
        return perfilId;
    }
}
