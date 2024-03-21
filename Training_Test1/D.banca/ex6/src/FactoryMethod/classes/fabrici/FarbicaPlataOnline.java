package FactoryMethod.classes.fabrici;

import FactoryMethod.classes.PlataCard;
import FactoryMethod.classes.PlataOnline;

public class FarbicaPlataOnline implements FarbicaAbstracta {

    @Override
    public PlataCard getFunctionalitate(int nrCard, String tipCard) {
        return new PlataOnline(nrCard, tipCard);
    }
}
