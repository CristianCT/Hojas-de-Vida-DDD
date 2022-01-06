package usecase;

import co.com.sofka.business.generic.BusinessException;
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

        if (command.getNombreCompleto().value().nombre().length() > 20)
            throw new BusinessException(command.getIdColaborador().value(), "El nombre excede el numero maximo de caracteres permitidos, Intente ingresar solo su primer nombre");

        if (command.getNombreCompleto().value().apellido().length() > 30)
            throw new BusinessException(command.getIdColaborador().value(),"El apellido excede el numero maximo de caracteres permitidos");


        colaborador.modificarNombreCompleto(command.getNombreCompleto());

        emit().onResponse(new ResponseEvents(colaborador.getUncommittedChanges()));
    }
}
