package MethodFactory.classes.factories;


import MethodFactory.classes.PachetCredite;
import MethodFactory.classes.PachetCrediteIpotecare;

public class FabricaPacheteCrediteIpotecare implements IFabricaPachete {
    @Override
    public PachetCredite getPachetCredite(int suma, String durataImprumut, String numeBeneficiar){
        return new PachetCrediteIpotecare(suma, durataImprumut, numeBeneficiar);
    }
}
