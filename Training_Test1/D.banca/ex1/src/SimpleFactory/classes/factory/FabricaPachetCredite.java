package SimpleFactory.classes.factory;

import SimpleFactory.classes.PachetCredite;
import SimpleFactory.classes.PachetCrediteIpotecare;
import SimpleFactory.classes.PachetCrediteNevoiPersonale;

public class FabricaPachetCredite {
    public FabricaPachetCredite() {
    }

    public PachetCredite getPachetCredite(TipPachetCredite tip, double suma, String durataImprumut, String numeBeneficiar) throws Exception {
        switch (tip) {
            case CREDITE_IPOTECARE:
                return new PachetCrediteIpotecare(suma, durataImprumut, numeBeneficiar);
            case CREDITE_NEVOI_PERSONALE:
                return new PachetCrediteNevoiPersonale(suma, durataImprumut, numeBeneficiar);
            default:
                throw new Exception("Tipul pachetului nu este unul valid");
        }
    }
}
