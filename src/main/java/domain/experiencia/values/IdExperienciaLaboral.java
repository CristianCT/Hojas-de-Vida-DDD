package domain.experiencia.values;

import co.com.sofka.domain.generic.Identity;
import domain.colaborador.values.IdColaborador;

public class IdExperienciaLaboral extends Identity {
    private IdExperienciaLaboral(String valor){
        super(valor);
    }

    public IdExperienciaLaboral(){
        super();
    }

    public static IdExperienciaLaboral of(String valor){
        return new IdExperienciaLaboral(valor);
    }
}
