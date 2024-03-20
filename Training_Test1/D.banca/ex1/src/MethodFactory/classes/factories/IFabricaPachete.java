package MethodFactory.classes.factories;


import MethodFactory.classes.PachetCredite;

public interface IFabricaPachete {
    PachetCredite getPachetCredite(int suma, String durataImprumut, String numeBeneficiar);
}
