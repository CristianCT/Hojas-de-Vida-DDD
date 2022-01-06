package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.colaborador.commands.CrearColaboradorCommand;
import domain.colaborador.events.ColaboradorCreado;
import domain.colaborador.values.*;
import domain.genericos.NombreCompleto;
import domain.hojadevida.values.IdHojaDeVida;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CrearColaboradorUseCaseTest {
    @Test
    public void crearColaborador(){
        IdColaborador idColaborador = IdColaborador.of("xxxx");
        NombreCompleto nombreCompleto = new NombreCompleto("Nombre", "Apellidos");
        IdHojaDeVida idHojaDeVida = IdHojaDeVida.of("xxxxx");
        FechaDeNacimiento fechaDeNacimiento = new FechaDeNacimiento(LocalDate.now());
        Cedula cedula = new Cedula("12345678");
        Genero genero = new Genero("MASCULINO");
        Area area = new Area("Desarrollo");


        var command = new CrearColaboradorCommand(idColaborador, idHojaDeVida, fechaDeNacimiento, nombreCompleto, cedula, genero, area);
        var usecase = new CrearColaboradorUseCase();


        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow();


        ColaboradorCreado event = (ColaboradorCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals("xxxxx", event.getIdHojaDeVida().value());
        Assertions.assertEquals(LocalDate.now(), event.getFechaDeNacimiento().value());
    }
}