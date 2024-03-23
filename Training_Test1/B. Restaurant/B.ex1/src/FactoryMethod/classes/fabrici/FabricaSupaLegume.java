package FactoryMethod.classes.fabrici;

import FactoryMethod.classes.Supa;
import FactoryMethod.classes.SupaDeLegume;

public class FabricaSupaLegume implements Fabrica {
    @Override
    public Supa getProdus(double pret, double cantitate) {
        return new SupaDeLegume(pret, cantitate);
    }
}
