package MethodFactory.classes;

public class PachetCrediteNevoiPersonale extends PachetCredite {
    private double sumaImprumutata;
    private String durataImprumutului;
    private String numeBeneficiar;

    public PachetCrediteNevoiPersonale(double sumaImprumutata, String durataImprumutului, String numeBeneficiar) {
        this.sumaImprumutata = sumaImprumutata;
        this.durataImprumutului = durataImprumutului;
        this.numeBeneficiar = numeBeneficiar;
    }

    public PachetCrediteNevoiPersonale() {
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
        return "PachetCrediteNevoiPersonale{" +
                "sumaImprumutata=" + sumaImprumutata +
                ", durataImprumutului='" + durataImprumutului + '\'' +
                ", numeBeneficiar='" + numeBeneficiar + '\'' +
                '}';
    }
}
