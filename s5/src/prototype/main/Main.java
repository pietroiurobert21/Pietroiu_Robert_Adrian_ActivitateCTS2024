package prototype.main;

import prototype.classes.Prototype;
import prototype.classes.Reteta;
import prototype.classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Reteta
        Map<String, Double> substante = new HashMap<>();
        substante.put("substanta 1", 200.0);
        substante.put("substanta 2", 450.20);
        substante.put("substanta 3", 35.45);

        Reteta reteta = new Reteta(substante, "paracetamol");
        Prototype reteta1 = reteta.clone();

        System.out.println(reteta);
        System.out.println(reteta1);

        // RetetaCrema
        RetetaCrema retetaCrema = new RetetaCrema(100, "tort");
        Prototype retetaCrema1 = retetaCrema.clone();

        System.out.println(retetaCrema);
        System.out.println(retetaCrema1);
    }
}
