package SimpleFactory.classes;

import SimpleFactory.classes.factory.FabricaPachetCredite;

public class PachetCrediteIpotecare extends PachetCredite {
    private double sumaImprumutata;
    private String durataImprumutului;
    private String numeBeneficiar;

    public PachetCrediteIpotecare(double sumaImprumutata, String durataImprumutului, String numeBeneficiar) {
        this.sumaImprumutata = sumaImprumutata;
        this.durataImprumutului = durataImprumutului;
        this.numeBeneficiar = numeBeneficiar;
    }

    public PachetCrediteIpotecare() {
    }

    public double getSumaImprumutata() {
        return sumaImprumutata;
    }

    public void setSumaImprumutata(double sumaImprumutata) {
        this.sumaImprumutata = sumaImprumutata;
    }

    public String getDurataImprumutului() {
        return durataImprumutului;
    }

    public void setDurataImprumutului(String durataImprumutului) {
        this.durataImprumutului = durataImprumutului;
    }

    public String getNumeBeneficiar() {
        return numeBeneficiar;
    }

    public void setNumeBeneficiar(String numeBeneficiar) {
        this.numeBeneficiar = numeBeneficiar;
    }

    @Override
    public String toString() {
        return "PachetCrediteIpotecare{" +
                "sumaImprumutata=" + sumaImprumutata +
                ", durataImprumutului='" + durataImprumutului + '\'' +
                ", numeBeneficiar='" + numeBeneficiar + '\'' +
                '}';
    }
}
