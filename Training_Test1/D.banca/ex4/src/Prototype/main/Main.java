package Prototype.main;

import Prototype.classes.ContAbstract;
import Prototype.classes.ContBancar;

public class Main {
    public static void main(String[] args) throws Exception {
        ContAbstract contBancar1 = new ContBancar("1234567890123", 4351);
        ContAbstract contBancar2 = contBancar1.clone();
        contBancar2.setNumarCard(4352);

        System.out.println(contBancar2);
        System.out.println(contBancar1);
    }
}