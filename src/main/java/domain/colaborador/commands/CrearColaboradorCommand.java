package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.*;

public class CrearColaboradorCommand extends Command {
    private final IdColaborador idColaborador;
    private final HojaDeVidaId hojaDeVidaId;
    private final FechaDeNacimiento fechaDeNacimiento;
    private final NombreCompleto nombreCompleto;
    private final Cedula cedula;
    private final Genero genero;
    private final Area area;

    public CrearColaboradorCommand(IdColaborador idColaborador, HojaDeVidaId hojaDeVidaId, FechaDeNacimiento fechaDeNacimiento, NombreCompleto nombreCompleto, Cedula cedula, Genero genero, Area area) {
        this.idColaborador = idColaborador;
        this.hojaDeVidaId = hojaDeVidaId;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.genero = genero;
        this.area = area;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public HojaDeVidaId getHojaDeVidaId() {
        return hojaDeVidaId;
    }

    public FechaDeNacimiento getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Genero getGenero() {
        return genero;
    }

    public Area getArea() {
        return area;
    }
}
