package SimpleFactory.main;

import SimpleFactory.classes.PachetCredite;
import SimpleFactory.classes.PachetCrediteIpotecare;
import SimpleFactory.classes.PachetCrediteNevoiPersonale;
import SimpleFactory.classes.factory.FabricaPachetCredite;
import SimpleFactory.classes.factory.TipPachetCredite;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO
        // 1. Banca oferă clienților pachete pentru realizarea de credite de nevoie personale sau credite
        // ipotecare. Să se implementeze modulul de construire de obiecte din familia creditelor

        FabricaPachetCredite fabricaPachetCredite = new FabricaPachetCredite();
        PachetCredite credite = fabricaPachetCredite.getPachetCredite(TipPachetCredite.CREDITE_IPOTECARE, 100000, "10 ani","Gigel Ionel");
        PachetCredite credite1 = fabricaPachetCredite.getPachetCredite(TipPachetCredite.CREDITE_NEVOI_PERSONALE, 50000, "12 ani", "Dorel Mirel");

        System.out.println(credite);
        System.out.println(credite1);
    }
}