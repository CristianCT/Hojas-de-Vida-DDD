package usecase;

import co.com.sofka.business.generic.BusinessException;
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

        if (!command.getInformacionDeContacto().value().email().contains("@"))
            throw new BusinessException(command.getIdPerfil().value(), "El correo ingresado no es valido");

        if (!command.getFotoDePerfil().value().contains(".png") || !command.getFotoDePerfil().value().contains(".jpg") || !command.getFotoDePerfil().value().contains(".jpeg"))
            throw new BusinessException(command.getIdPerfil().value(), "El formato de la imagen no es soportado");

        emit().onResponse(new ResponseEvents(perfil.getUncommittedChanges()));
    }
}
