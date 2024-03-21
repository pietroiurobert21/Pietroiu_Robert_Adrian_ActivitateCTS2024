package FactoryMethod.classes;

public class PlataContactLess extends PlataCard {
    public PlataContactLess(int nrCard, String tipCard) {
        super(nrCard, tipCard);
    }

    @Override
    public String toString() {
        return "PlataContactLess{" +
                "nrCard=" + nrCard +
                ", tipCard='" + tipCard + '\'' +
                '}';
    }
}
