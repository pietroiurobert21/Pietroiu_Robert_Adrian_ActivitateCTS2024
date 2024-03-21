package FactoryMethod.classes.fabrici;

import FactoryMethod.classes.PlataCard;
import FactoryMethod.classes.PlataContactLess;

public class FabricaContactLess implements FarbicaAbstracta {

    @Override
    public PlataCard getFunctionalitate(int nrCard, String tipCard) {
        return new PlataContactLess(nrCard, tipCard);
    }
}
