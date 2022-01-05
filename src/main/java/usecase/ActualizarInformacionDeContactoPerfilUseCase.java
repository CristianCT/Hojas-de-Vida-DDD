package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.perfil.Perfil;
import domain.perfil.commands.ActualizarInformacionContactoCommand;

public class ActualizarInformacionDeContactoPerfilUseCase extends UseCase<RequestCommand<ActualizarInformacionContactoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarInformacionContactoCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var perfil = Perfil.from(command.getIdPerfil(), retrieveEvents());

        perfil.actualizarInformacionDeContacto(command.getInformacionDeContacto());
        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
