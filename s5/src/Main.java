import prototype.Prototype;
import prototype.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Pacient pacient = new Pacient.PacientBuilder().setPatRabatabil(true).setHalatPentruInterior(true).build();
//        System.out.println(pacient);

        Map<String, Double> solutii = new HashMap<>();
        solutii.put("Solutie1", 200.0);
        solutii.put("Solutie1", 240.0);
        solutii.put("Solutie1", 30.5);
        Prototype prototype = new RetetaCrema(solutii, "Medicament magic");
        Prototype clona1 = prototype.clone();

        System.out.println(prototype);
        System.out.println(clona1);
    }
}