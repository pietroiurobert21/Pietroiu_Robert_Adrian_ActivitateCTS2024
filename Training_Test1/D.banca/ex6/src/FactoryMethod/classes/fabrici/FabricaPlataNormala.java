package FactoryMethod.classes.fabrici;

import FactoryMethod.classes.PlataCard;
import FactoryMethod.classes.PlataNormala;

public class FabricaPlataNormala implements FarbicaAbstracta {

    @Override
    public PlataCard getFunctionalitate(int nrCard, String tipCard) {
        return new PlataNormala(nrCard, tipCard);
    }
}
