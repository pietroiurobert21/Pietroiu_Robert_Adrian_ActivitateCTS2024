package FactoryMethod.main;

import FactoryMethod.classes.Supa;
import FactoryMethod.classes.SupaDeCiuperci;
import FactoryMethod.classes.fabrici.Fabrica;
import FactoryMethod.classes.fabrici.FabricaSupaCiuperci;
import FactoryMethod.classes.fabrici.FabricaSupaLegume;
import FactoryMethod.classes.fabrici.FabricaSupaVita;

public class Main {
    public static void main(String[] args) {
        Fabrica fabricaSupaCiuperci = new FabricaSupaCiuperci();
        Fabrica fabricaSupaLegume = new FabricaSupaLegume();
        Fabrica fabricaSupaVita = new FabricaSupaVita();

        Supa supaDeCiuperci = fabricaSupaCiuperci.getProdus(30, 300);
        Supa supaDeLegume = fabricaSupaLegume.getProdus(28, 320);
        Supa supaDeVita = fabricaSupaVita.getProdus(35, 280);

        System.out.println(supaDeCiuperci.toString());
        System.out.println(supaDeLegume.toString());
        System.out.println(supaDeVita.toString());
    }
}