package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.colaborador.Colaborador;
import domain.colaborador.commands.CrearColaboradorCommand;

public class CrearColaboradorUseCase extends UseCase<RequestCommand<CrearColaboradorCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearColaboradorCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var colaborador = new Colaborador(command.getIdColaborador(), command.getHojaDeVidaId(), command.getFechaDeNacimiento(), command.getNombreCompleto(), command.getCedula(), command.getGenero(), command.getArea());
        emit().onResponse(new ResponseEvents(colaborador.getUncommittedChanges()));
    }
}
