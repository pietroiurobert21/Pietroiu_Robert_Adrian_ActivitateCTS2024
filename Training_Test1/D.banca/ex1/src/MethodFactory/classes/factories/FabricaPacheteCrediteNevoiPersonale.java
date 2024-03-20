package MethodFactory.classes.factories;


import MethodFactory.classes.PachetCredite;
import MethodFactory.classes.PachetCrediteNevoiPersonale;

public class FabricaPacheteCrediteNevoiPersonale implements IFabricaPachete {
    @Override
    public PachetCredite getPachetCredite(int suma, String durataImprumut, String numeBeneficiar) {
        return new PachetCrediteNevoiPersonale(suma, durataImprumut, numeBeneficiar);
    }
}
