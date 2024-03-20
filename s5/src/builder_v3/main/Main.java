package builder_v3.main;

import builder_v3.classes.Pacient;
import builder_v3.classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient.PacientBuilder().setHalatPentruInterior(true).build();
        Pacient pacient2 = new Pacient.PacientBuilder()
                .setHalatPentruInterior(true)
                .setMicDejunInclus(true)
                .setPapuciDeCamera(true)
                .setPatRabatabil(true)
                .build();

        System.out.println(pacient);
        System.out.println(pacient2);
    }
}
