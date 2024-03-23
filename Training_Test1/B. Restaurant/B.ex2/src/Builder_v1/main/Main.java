package Builder_v1.main;

import Builder_v1.classes.Rezervare;
import Builder_v1.classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare_1 = new RezervareBuilder()
                .setAsezareLaGeam(true)
                .setDecorareaMesei(true)
                .setGenMuzica(true)
                .setScauneErgonomica(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .build();
        Rezervare rezervare_2 = new RezervareBuilder()
                .setAsezareLaGeam(true)
                .build();

        System.out.println(rezervare_1);
        System.out.println(rezervare_2);
    }
}