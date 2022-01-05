package domain.perfil;

import co.com.sofka.domain.generic.EventChange;
import domain.perfil.events.*;

import java.util.HashSet;

public class PerfilChange extends EventChange {
    public PerfilChange(Perfil perfil){
        apply((PerfilCreado event) -> {
            perfil.idHojaDeVida = event.getIdHojaDeVida();
            perfil.informacionDeContacto = event.getInformacionDeContacto();
            perfil.fotoDePerfil = event.getFotoDePerfil();
            perfil.referencias = new HashSet<>();
        });

        apply((NuevaReferenciaAgregada event) -> {
            perfil.referencias.add(
                new Referencia(
                    event.getIdReferencia(),
                    event.getInformacionDeContacto(),
                    event.getNombreCompleto()
                )
            );
        });

        apply((ReferenciaEliminada event) -> {
            perfil.referencias.removeIf(referencia -> referencia.identity().equals(event.getIdReferencia()));
        });

        apply((InformacionContactoReferenciaActualizada event) -> {
            perfil.referencias
                    .stream()
                    .filter(referencia -> referencia.identity().equals(event.getIdReferencia()))
                    .forEach(referencia -> referencia.actualizarInformacionDeContacto(event.getInformacionDeContacto()));
        });

        apply((NombreCompletoReferenciaActualizado event) -> {
            perfil.referencias
                    .stream()
                    .filter(referencia -> referencia.identity().equals(event.getIdReferencia()))
                    .forEach(referencia -> referencia.actualizarNombreCompleto(event.getNombreCompleto()));
        });

        apply((InformacionDeContactoActualizada event) -> {
            perfil.informacionDeContacto = event.getInformacionDeContacto();
        });

        apply((FotoDePerfilActualizada event) -> {
            perfil.fotoDePerfil = event.getFotoDePerfil();
        });
    }
}
