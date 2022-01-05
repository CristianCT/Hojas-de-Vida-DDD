package domain.perfil.values;

import co.com.sofka.domain.generic.Identity;
import domain.gestioncertificacion.values.IdCertificacion;

public class IdPerfil extends Identity {
    private IdPerfil(String valor){
        super(valor);
    }

    public IdPerfil(){
        super();
    }

    public static IdPerfil of(String valor){
        return new IdPerfil(valor);
    }
}
