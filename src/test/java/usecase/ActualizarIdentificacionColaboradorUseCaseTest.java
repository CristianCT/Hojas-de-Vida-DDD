package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.commands.ActualizarIdentificacionCommand;
import domain.colaborador.events.CedulaModificada;
import domain.colaborador.values.Cedula;
import domain.colaborador.values.IdColaborador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarIdentificacionColaboradorUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    public void actualizarIdentificacionColaborador(){
        Cedula cedula = new Cedula("123456789");
        IdColaborador idColaborador = IdColaborador.of("xxxxx");


        var command = new ActualizarIdentificacionCommand(idColaborador, cedula);
        var usecase = new ActualizarIdentificacionColaboradorUseCase();


        usecase.addRepository(repository);
        when(repository.getEventsBy("xxxxx")).thenReturn(events());


        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idColaborador.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        var event = (CedulaModificada) events.get(0);


        Assertions.assertEquals("xxxxx", event.aggregateRootId());
        Assertions.assertEquals("123456789", event.getCedula().value());
    }

    private List<DomainEvent> events() {
        return List.of(new CedulaModificada(
                new Cedula("123456789")
        ));
    }
}