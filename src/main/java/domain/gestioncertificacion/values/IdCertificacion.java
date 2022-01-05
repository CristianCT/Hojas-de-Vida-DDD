package domain.gestioncertificacion.values;

import co.com.sofka.domain.generic.Identity;

public class IdCertificacion extends Identity {
    private IdCertificacion(String valor){
        super(valor);
    }

    public IdCertificacion(){
        super();
    }

    public static IdCertificacion of(String valor){
        return new IdCertificacion(valor);
    }
}
