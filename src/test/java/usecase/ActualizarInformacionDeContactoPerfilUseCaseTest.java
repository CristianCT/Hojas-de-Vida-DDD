package usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.perfil.commands.ActualizarInformacionContactoCommand;
import domain.perfil.events.InformacionDeContactoActualizada;
import domain.perfil.values.IdPerfil;
import domain.perfil.values.InformacionDeContacto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarInformacionDeContactoPerfilUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    public void actualizarInformacionDeContactoPerfil(){
        InformacionDeContacto informacionDeContacto = new InformacionDeContacto("email.ejemplo@gmail.com", "+57 3043435036", "Transversal 70");
        IdPerfil idPerfil = IdPerfil.of("xxxx");


        var command = new ActualizarInformacionContactoCommand(idPerfil, informacionDeContacto);
        var usecase = new ActualizarInformacionDeContactoPerfilUseCase();


        usecase.addRepository(repository);
        when(repository.getEventsBy("xxxx")).thenReturn(events());


        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idPerfil.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event = (InformacionDeContactoActualizada) events.get(0);

        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("email.ejemplo@gmail.com", event.getInformacionDeContacto().value().email());
        Assertions.assertEquals("+57 3043435036", event.getInformacionDeContacto().value().telefono());
        Assertions.assertEquals("Transversal 70", event.getInformacionDeContacto().value().direccion());
    }

    private List<DomainEvent> events() {
        return List.of(new InformacionDeContactoActualizada(
                new InformacionDeContacto("email.ejemplo@gmail.com", "+57 3043435036", "Transversal 70" )
        ));
    }

    @Test
    public void errorActualizarInformacionDeContactoPerfilEmailIncorrecto(){
        InformacionDeContacto informacionDeContacto = new InformacionDeContacto(
                "email.ejemplogmail.com",
                "+57 3043435036",
                "Transversal 70");
        IdPerfil idPerfil = IdPerfil.of("xxxx");


        var command = new ActualizarInformacionContactoCommand(idPerfil, informacionDeContacto);
        var usecase = new ActualizarInformacionDeContactoPerfilUseCase();


        usecase.addRepository(repository);
        when(repository.getEventsBy("xxxx")).thenReturn(events());

        var error = Assertions.assertThrows(BusinessException.class, () -> {
            UseCaseHandler.getInstance()
                    .setIdentifyExecutor(command.getIdPerfil().value())
                    .syncExecutor(usecase, new RequestCommand<>(command))
                    .orElseThrow();
        });

        Assertions.assertEquals("El email ingresado no es valido", error.getMessage());

    }
}