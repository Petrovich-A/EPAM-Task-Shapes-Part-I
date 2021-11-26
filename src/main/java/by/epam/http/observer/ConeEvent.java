package by.epam.http.observer;

import by.epam.http.entity.Cone;

import java.util.EventObject;

public class ConeEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public ConeEvent(Object source) {
        super(source);
    }
    @Override
    public Cone getSource(){
        return (Cone) super.getSource();
    }

}
