package domain.colaborador.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.colaborador.values.Area;

public class AreaModificada extends DomainEvent {
    private final Area area;
    public AreaModificada(Area area) {
        super("sofkau.domain.colaborador.areamodificada");
        this.area = area;
    }

    public Area getArea() {
        return area;
    }
}
