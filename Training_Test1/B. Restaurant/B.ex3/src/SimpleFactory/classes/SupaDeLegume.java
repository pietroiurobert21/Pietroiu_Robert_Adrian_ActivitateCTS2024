package SimpleFactory.classes;

public class SupaDeLegume extends Supa {
    public SupaDeLegume(double pret, double cantitate) {
        super(pret, cantitate);
    }

    @Override
    public String toString() {
        return "SupaDeLegume{" +
                "pret=" + getPret() +
                ", cantitate=" + getCantitate() +
                '}';
    }
}
