package domain.gestioncertificacion.values;

import co.com.sofka.domain.generic.Identity;
import domain.colaborador.values.IdColaborador;

public class IdGestionCertificacion extends Identity {
    private IdGestionCertificacion(String valor){
        super(valor);
    }

    public IdGestionCertificacion(){
        super();
    }

    public static IdGestionCertificacion of(String valor){
        return new IdGestionCertificacion(valor);
    }
}
