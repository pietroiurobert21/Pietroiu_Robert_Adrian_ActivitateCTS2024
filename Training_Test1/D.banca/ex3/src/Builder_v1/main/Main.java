package Builder_v1.main;

import Builder_v1.classes.Cont;
import Builder_v1.classes.ContBuilder;

public class Main {
    public static void main(String[] args) {
        // v1 is not suitable if we need to build many objects
        Cont cont = new ContBuilder().setPrimesteSalariul(true).build();
        Cont cont1 = new ContBuilder()
                .setPrimesteSalariul(true)
                .setCardAtasat(true)
                .setInternetBanking(true)
                .build();

        System.out.println(cont);
        System.out.println(cont1);
    }
}