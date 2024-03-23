package FactoryMethod.classes.fabrici;

import FactoryMethod.classes.Supa;
import FactoryMethod.classes.SupaDeVita;

public class FabricaSupaVita implements Fabrica {
    @Override
    public Supa getProdus(double pret, double cantitate) {
        return new SupaDeVita(pret, cantitate);
    }
}
