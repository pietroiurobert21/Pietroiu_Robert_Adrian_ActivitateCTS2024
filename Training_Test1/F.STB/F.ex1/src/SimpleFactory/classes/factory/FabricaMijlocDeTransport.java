package SimpleFactory.classes.factory;

import SimpleFactory.classes.Autobuz;
import SimpleFactory.classes.MijlocDeTransport;
import SimpleFactory.classes.Tramvai;
import SimpleFactory.classes.Troleibuz;

public class FabricaMijlocDeTransport {
    public MijlocDeTransport getMijlocDeTransport(TipuriTransport tipuriTransport, double pretBilet, String program) throws Exception {
        switch (tipuriTransport){
            case AUTOBUZ:
                return new Autobuz(pretBilet, program);
            case TRAMVAI:
                return new Tramvai(pretBilet, program);
            case TROLEIBUZ:
                return new Troleibuz(pretBilet, program);
            default:
                throw new Exception("tipul nu este valid");
        }
    }
}
