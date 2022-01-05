package domain.gestioneducacion.values;

import co.com.sofka.domain.generic.Identity;

public class IdEducacion extends Identity {
    private IdEducacion(String valor){
        super(valor);
    }

    public IdEducacion(){
        super();
    }

    public static IdEducacion of(String valor){
        return new IdEducacion(valor);
    }
}
