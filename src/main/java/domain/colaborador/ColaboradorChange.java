package domain.colaborador;

import co.com.sofka.domain.generic.EventChange;
import domain.colaborador.events.*;

public class ColaboradorChange extends EventChange {
    public ColaboradorChange(Colaborador colaborador) {
        apply((ColaboradorCreado event) -> {
            colaborador.idHojaDeVida = event.getIdHojaDeVida();
            colaborador.fechaDeNacimiento = event.getFechaDeNacimiento();
            colaborador.nombreCompleto = event.getNombreCompleto();
            colaborador.cedula = event.getCedula();
            colaborador.genero = event.getGenero();
            colaborador.area = event.getArea();
            colaborador.idPerfil = null;
        });

        apply((PerfilAgregado event) -> {
            colaborador.idPerfil = event.getIdPerfil();
        });

        apply((FechaDeNacimientoModificada event) -> {
            colaborador.fechaDeNacimiento = event.getFechaDeNacimiento();
        });

        apply((NombreCompletoModificado event) -> {
            colaborador.nombreCompleto = event.getNombreCompleto();
        });

        apply((CedulaModificada event) -> {
            colaborador.cedula = event.getCedula();
        });

        apply((GeneroModificado event) -> {
            colaborador.genero = event.getGenero();
        });

        apply((AreaModificada event) -> {
            colaborador.area = event.getArea();
        });
    }
}
