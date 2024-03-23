package FactoryMethod.classes;

public abstract class Supa {
    private double pret;
    private double cantitate;

    public Supa(double pret, double cantitate) {
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public Supa() {
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }

    public double getPret() {
        return pret;
    }

    public double getCantitate() {
        return cantitate;
    }
}
