package SimpleFactory.main;

import SimpleFactory.classes.Supa;
import SimpleFactory.classes.fabrica.Fabrica;
import SimpleFactory.classes.fabrica.TipSupa;

public class Main {
    public static void main(String[] args) throws Exception {
        Fabrica fabricaSupa = new Fabrica();

        Supa supaDeCiuperci = fabricaSupa.getSupa(TipSupa.SUPA_DE_CIUPERCI, 30, 300);
        Supa supaDeLegume = fabricaSupa.getSupa(TipSupa.SUPA_DE_LEGUME, 28, 320);
        Supa supaDeVita = fabricaSupa.getSupa(TipSupa.SUPA_DE_VITA, 35, 280);

        System.out.println(supaDeCiuperci);
        System.out.println(supaDeLegume);
        System.out.println(supaDeVita);
    }
}