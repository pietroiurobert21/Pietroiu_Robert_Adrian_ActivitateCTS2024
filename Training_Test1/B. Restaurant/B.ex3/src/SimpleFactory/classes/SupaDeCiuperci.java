package SimpleFactory.classes;

public class SupaDeCiuperci extends Supa {
    public SupaDeCiuperci(double pret, double cantitate) {
        super(pret, cantitate);
    }

    @Override
    public String toString() {
        return "SupaDeCiuperci{" +
                "pret=" + getPret() +
                ", cantitate=" + getCantitate() +
                '}';
    }
}
