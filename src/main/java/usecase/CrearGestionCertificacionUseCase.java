package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.gestioncertificacion.GestionCertificacion;
import domain.gestioncertificacion.commands.CrearGestionCertificacionCommand;

public class CrearGestionCertificacionUseCase extends UseCase<RequestCommand<CrearGestionCertificacionCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearGestionCertificacionCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var gestionCertificacion = new GestionCertificacion(command.getIdGestionCertificacion(), command.getIdHojaDeVida());

        emit().onResponse(new ResponseEvents(gestionCertificacion.getUncommittedChanges()));
    }
}
