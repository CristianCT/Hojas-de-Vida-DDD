package domain.colaborador.values;

import co.com.sofka.domain.generic.Identity;

public class HojaDeVidaId extends Identity {
    private HojaDeVidaId(String valor){
        super(valor);
    }

    public HojaDeVidaId(){
        super();
    }

    public static HojaDeVidaId of(String valor){
        return new HojaDeVidaId(valor);
    }
}
