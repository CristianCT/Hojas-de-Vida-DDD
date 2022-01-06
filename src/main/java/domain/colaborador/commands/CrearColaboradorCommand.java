package domain.colaborador.commands;

import co.com.sofka.domain.generic.Command;
import domain.colaborador.values.*;
import domain.genericos.NombreCompleto;
import domain.hojadevida.values.IdHojaDeVida;

public class CrearColaboradorCommand extends Command {
    private final IdColaborador idColaborador;
    private final IdHojaDeVida idHojaDeVida;
    private final FechaDeNacimiento fechaDeNacimiento;
    private final NombreCompleto nombreCompleto;
    private final Cedula cedula;
    private final Genero genero;
    private final Area area;

    public CrearColaboradorCommand(IdColaborador idColaborador, IdHojaDeVida idHojaDeVida, FechaDeNacimiento fechaDeNacimiento, NombreCompleto nombreCompleto, Cedula cedula, Genero genero, Area area) {
        this.idColaborador = idColaborador;
        this.idHojaDeVida = idHojaDeVida;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.genero = genero;
        this.area = area;
    }

    public IdColaborador getIdColaborador() {
        return idColaborador;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
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
