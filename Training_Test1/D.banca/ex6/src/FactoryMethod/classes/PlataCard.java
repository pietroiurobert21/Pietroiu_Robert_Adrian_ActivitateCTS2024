package FactoryMethod.classes;

public abstract class PlataCard {
    int nrCard;
    String tipCard;

    public PlataCard(int nrCard, String tipCard) {
        this.nrCard = nrCard;
        this.tipCard = tipCard;
    }

    public PlataCard() {
    }

    public void setNrCard(int nrCard) {
        this.nrCard = nrCard;
    }

    public void setTipCard(String tipCard) {
        this.tipCard = tipCard;
    }
}
