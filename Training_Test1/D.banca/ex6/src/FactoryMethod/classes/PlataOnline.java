package FactoryMethod.classes;

public class PlataOnline extends PlataCard {
    public PlataOnline(int nrCard, String tipCard) {
        super(nrCard, tipCard);
    }

    @Override
    public String toString() {
        return "PlataOnline{" +
                "nrCard=" + nrCard +
                ", tipCard='" + tipCard + '\'' +
                '}';
    }
}
