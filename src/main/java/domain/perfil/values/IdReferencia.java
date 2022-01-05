package domain.perfil.values;

import co.com.sofka.domain.generic.Identity;

public class IdReferencia extends Identity {
    private IdReferencia(String valor){
        super(valor);
    }

    public IdReferencia(){
        super();
    }

    public static IdReferencia of(String valor){
        return new IdReferencia(valor);
    }
}
