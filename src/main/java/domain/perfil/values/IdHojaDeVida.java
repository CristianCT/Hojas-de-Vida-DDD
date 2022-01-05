package domain.perfil.values;

import co.com.sofka.domain.generic.Identity;

public class IdHojaDeVida extends Identity {
    private IdHojaDeVida(String valor){
        super(valor);
    }

    public IdHojaDeVida(){
        super();
    }

    public static IdHojaDeVida of(String valor){
        return new IdHojaDeVida(valor);
    }
}
