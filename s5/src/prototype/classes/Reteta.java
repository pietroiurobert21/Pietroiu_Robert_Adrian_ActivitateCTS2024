package prototype.classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype {
    private Map<String, Double> solutii;
    private String numeMedicament;

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();
        for(String solutie: solutii.keySet()) {
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    public Reteta(Map<String, Double> solutii, String numeMedicament) {
        this.solutii = solutii;
        this.numeMedicament = numeMedicament;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public Reteta() {
        this.solutii = null;
        this.numeMedicament = "necunoscut";
    }

    @Override
    public Prototype clone() {
        Reteta reteta = new Reteta();
        reteta.setNumeMedicament(this.numeMedicament);
        reteta.setSolutii(this.solutii);
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeMedicament='" + numeMedicament + '\'' +
                '}';
    }
}
