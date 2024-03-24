package Prototype.classes;

public class Rezervare implements RezervareAbstracta {
    private String numeClient;
    private int nrMasa;

    public Rezervare(String numeClient, int nrMasa) {
        this.numeClient = numeClient;
        this.nrMasa = nrMasa;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrMasa=" + nrMasa +
                '}';
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare(this.numeClient, this.nrMasa);
        return rezervareNoua;
    }
}
