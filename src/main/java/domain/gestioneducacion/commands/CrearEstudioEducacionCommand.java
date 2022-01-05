package domain.gestioneducacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.gestioneducacion.values.IdGestionEducacion;
import domain.perfil.values.IdHojaDeVida;

public class CrearEstudioEducacionCommand extends Command {
    private final IdGestionEducacion idGestionEducacion;
    private final IdHojaDeVida idHojaDeVida;

    public CrearEstudioEducacionCommand(IdGestionEducacion idGestionEducacion, IdHojaDeVida idHojaDeVida) {
        this.idGestionEducacion = idGestionEducacion;
        this.idHojaDeVida = idHojaDeVida;
    }

    public IdGestionEducacion getIdGestionEducacion() {
        return idGestionEducacion;
    }

    public IdHojaDeVida getIdHojaDeVida() {
        return idHojaDeVida;
    }
}
