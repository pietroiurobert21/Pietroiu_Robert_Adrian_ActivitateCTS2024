package builder_v1.main;

import builder_v1.classes.Pacient;
import builder_v1.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder().setPatRabatabil(true).build();
        Pacient pacient2 = new PacientBuilder()
                .setPatRabatabil(true)
                .setHalatPentruInterior(true)
                .setMicDejunInclus(true)
                .setPapuciDeCamera(true)
                .build();

        System.out.println(pacient);
        System.out.println(pacient2);
    }
}
