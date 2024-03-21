package FactoryMethod.classes;

public class PlataNormala extends PlataCard {
    public PlataNormala(int nrCard, String tipCard) {
        super(nrCard, tipCard);
    }

    @Override
    public String toString() {
        return "PlataNormala{" +
                "nrCard=" + nrCard +
                ", tipCard='" + tipCard + '\'' +
                '}';
    }
}
