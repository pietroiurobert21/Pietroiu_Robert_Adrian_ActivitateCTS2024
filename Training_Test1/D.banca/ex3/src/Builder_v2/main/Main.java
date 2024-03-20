package Builder_v2.main;

import Builder_v2.classes.Cont;
import Builder_v2.classes.ContBuilder;

public class Main {
    public static void main(String[] args) {
        // v2 is most suitable when we need to build many objects
        ContBuilder builder = new ContBuilder();
        Cont c1 = builder.setPrimesteSalariul(true).build();
        Cont c2 = builder.setCardAtasat(true).setInternetBanking(true).setPrimesteSalariul(true).build();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1);
    }
}
