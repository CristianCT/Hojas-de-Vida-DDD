package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.colaborador.Colaborador;
import domain.colaborador.commands.ActualizarNombreCompletoCommand;

public class ActualizarNombreCompletoColaboradorUseCase extends UseCase<RequestCommand<ActualizarNombreCompletoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreCompletoCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var colaborador = Colaborador.from(command.getIdColaborador(), retrieveEvents());

        colaborador.modificarNombreCompleto(command.getNombreCompleto());
        emit().onResponse(new ResponseEvents(colaborador.getUncommittedChanges()));
    }
}
