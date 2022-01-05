package domain.colaborador.values;

import co.com.sofka.domain.generic.Identity;

public class IdColaborador extends Identity {

    private IdColaborador(String valor){
        super(valor);
    }

    public IdColaborador(){
        super();
    }

    public static IdColaborador of(String valor){
        return new IdColaborador(valor);
    }
}
