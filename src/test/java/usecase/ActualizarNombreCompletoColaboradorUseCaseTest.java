package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.commands.ActualizarNombreCompletoCommand;
import domain.colaborador.events.NombreCompletoModificado;
import domain.colaborador.values.IdColaborador;
import domain.genericos.NombreCompleto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarNombreCompletoColaboradorUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    public void actualizarNombreCompletoColaborador(){
        NombreCompleto nombreCompleto = new NombreCompleto("nombre", "Apellido");
        IdColaborador idColaborador = IdColaborador.of("xxxx");


        var command = new ActualizarNombreCompletoCommand(idColaborador, nombreCompleto);
        var usecase = new ActualizarNombreCompletoColaboradorUseCase();


        usecase.addRepository(repository);
        when(repository.getEventsBy("xxxx")).thenReturn(events());


        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idColaborador.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event = (NombreCompletoModificado) events.get(0);

        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("nombre", event.getNombreCompleto().value().nombre());
    }

    private List<DomainEvent> events() {
        return List.of(new NombreCompletoModificado(
                new NombreCompleto("nombre", "Apellido" )
        ));
    }
}