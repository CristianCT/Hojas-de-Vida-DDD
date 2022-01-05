package domain.gestioneducacion.values;

import co.com.sofka.domain.generic.Identity;

public class IdGestionEducacion extends Identity {
    private IdGestionEducacion(String valor){
        super(valor);
    }

    public IdGestionEducacion(){
        super();
    }

    public static IdGestionEducacion of(String valor){
        return new IdGestionEducacion(valor);
    }
}
