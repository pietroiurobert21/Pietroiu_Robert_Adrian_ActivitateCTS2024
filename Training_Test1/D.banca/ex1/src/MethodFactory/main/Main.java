package MethodFactory.main;

import MethodFactory.classes.PachetCredite;
import MethodFactory.classes.factories.FabricaPacheteCrediteIpotecare;

public class Main {
    public static void main(String[] args) {
        PachetCredite pachetCredite = new FabricaPacheteCrediteIpotecare().getPachetCredite(1000, "1 an", "Ionel Gigel");
        System.out.println(pachetCredite.toString());
    }
}
