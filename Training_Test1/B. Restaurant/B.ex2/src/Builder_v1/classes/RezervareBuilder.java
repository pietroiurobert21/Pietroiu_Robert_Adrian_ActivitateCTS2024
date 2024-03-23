package Builder_v1.classes;

public class RezervareBuilder implements Builder {

    Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare = new Rezervare(false, false, false, false, false);
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RezervareBuilder setScauneErgonomica(boolean scauneErgonomica) {
        this.rezervare.setScauneErgonomica(scauneErgonomica);
        return this;
    }

    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
        this.rezervare.setDecorareaMesei(decorareaMesei);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
