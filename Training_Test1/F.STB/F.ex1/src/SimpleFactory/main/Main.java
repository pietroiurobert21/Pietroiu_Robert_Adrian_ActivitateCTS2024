package SimpleFactory.main;

import SimpleFactory.classes.Autobuz;
import SimpleFactory.classes.MijlocDeTransport;
import SimpleFactory.classes.factory.FabricaMijlocDeTransport;
import SimpleFactory.classes.factory.TipuriTransport;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaMijlocDeTransport fabrica = new FabricaMijlocDeTransport();
        MijlocDeTransport autobuz = fabrica.getMijlocDeTransport(TipuriTransport.AUTOBUZ, 3,"6:00 - 22:00");
        MijlocDeTransport tramvai = fabrica.getMijlocDeTransport(TipuriTransport.TRAMVAI, 3,"6:00 - 22:00");
        MijlocDeTransport troleibuz = fabrica.getMijlocDeTransport(TipuriTransport.TROLEIBUZ, 3,"6:00 - 22:00");
        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());
    }
}