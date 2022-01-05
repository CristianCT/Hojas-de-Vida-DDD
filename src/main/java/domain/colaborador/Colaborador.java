package domain.colaborador;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.colaborador.values.*;

public class Colaborador extends AggregateEvent<IdColaborador> {
    protected HojaDeVidaId hojaDeVidaId;
    protected FechaDeNacimiento fechaDeNacimiento;
    protected NombreCompleto nombreCompleto;
    protected Cedula cedula;
    protected Genero genero;
    protected Area area;
    protected PerfilId perfilId;

    public Colaborador(IdColaborador entityId, HojaDeVidaId hojaDeVidaId, FechaDeNacimiento fechaDeNacimiento, Cedula cedula, Genero genero, Area area) {
        super(entityId);
        this.hojaDeVidaId = hojaDeVidaId;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.cedula = cedula;
        this.genero = genero;
        this.area = area;
    }

    // COMPORTAMIENTOS
    public void agregarPerfil(){

    }

    public void modificarFechaDeNacimiento(){

    }

    public void modificarNombreCompleto(){

    }

    public void modificarCedula(){

    }

    public void modificarGenero(){

    }

    public void modificarArea(){

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
