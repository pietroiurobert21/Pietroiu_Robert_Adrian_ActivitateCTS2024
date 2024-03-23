package FactoryMethod.classes;

public class SupaDeVita extends Supa {
    public SupaDeVita(double pret, double cantitate) {
        super(pret, cantitate);
    }

    @Override
    public String toString() {
        return "SupaDeVita{" +
                "pret=" + getPret() +
                ", cantitate=" + getCantitate() +
                '}';
    }
}
