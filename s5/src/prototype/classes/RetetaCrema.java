package prototype.classes;

public class RetetaCrema implements Prototype {
    private int cantitate;
    private String denumire;

    public RetetaCrema(int cantitate, String denumire) {
        this.cantitate = cantitate;
        this.denumire = denumire;
    }

    public RetetaCrema() {
        this.cantitate = 0;
        this.denumire = "necunoscuta";
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }



    @Override
    public Prototype clone() {
        RetetaCrema retetaCrema = new RetetaCrema();
        retetaCrema.setCantitate(this.cantitate);
        retetaCrema.setDenumire(this.denumire);
        return retetaCrema;
    }

    @Override
    public String toString() {
        return "RetetaCrema{" +
                "cantitate=" + cantitate +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
