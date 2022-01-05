package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.colaborador.Colaborador;
import domain.colaborador.commands.ActualizarIdentificacionCommand;

public class ActualizarIdentificacionColaboradorUseCase extends UseCase<RequestCommand<ActualizarIdentificacionCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarIdentificacionCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var colaborador = Colaborador.from(command.getIdColaborador(), retrieveEvents());

        colaborador.modificarCedula(command.getCedula());
        emit().onResponse(new ResponseEvents(colaborador.getUncommittedChanges()));
    }
}
