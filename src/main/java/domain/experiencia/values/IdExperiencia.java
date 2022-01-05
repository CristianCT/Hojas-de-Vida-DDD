package domain.experiencia.values;

import co.com.sofka.domain.generic.Identity;
import domain.colaborador.values.IdColaborador;

public class IdExperiencia extends Identity {
    private IdExperiencia(String valor){
        super(valor);
    }

    public IdExperiencia(){
        super();
    }

    public static IdExperiencia of(String valor){
        return new IdExperiencia(valor);
    }
}
