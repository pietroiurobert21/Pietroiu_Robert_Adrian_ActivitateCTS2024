package SimpleFactory.classes.fabrica;

import SimpleFactory.classes.Supa;
import SimpleFactory.classes.SupaDeCiuperci;
import SimpleFactory.classes.SupaDeLegume;
import SimpleFactory.classes.SupaDeVita;

public class Fabrica {
    public Supa getSupa(TipSupa tipSupa, double pret, double cantitate) throws Exception {
        switch (tipSupa) {
            case SUPA_DE_CIUPERCI:
                return new SupaDeCiuperci(pret, cantitate);
            case SUPA_DE_LEGUME:
                return new SupaDeLegume(pret, cantitate);
            case SUPA_DE_VITA:
                return new SupaDeVita(pret, cantitate);
            default:
                throw new Exception("tip invalid");
        }
    }
}
