package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.perfil.Perfil;
import domain.perfil.commands.CrearPerfilCommand;

public class CrearPerfilUseCase extends UseCase<RequestCommand<CrearPerfilCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPerfilCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var perfil = new Perfil(command.getIdPerfil(), command.getIdHojaDeVida(), command.getInformacionDeContacto(), command.getFotoDePerfil());

        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
