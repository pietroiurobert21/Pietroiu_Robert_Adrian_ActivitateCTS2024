package Builder_v1.classes;

public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneErgonomica;
    private boolean decorareaMesei;
    private boolean muzicaAmbientalaPersonalizata;
    private boolean genMuzica;

    public Rezervare(boolean asezareLaGeam, boolean scauneErgonomica, boolean decorareaMesei, boolean muzicaAmbientalaPersonalizata, boolean genMuzica) {
        this.asezareLaGeam = asezareLaGeam;
        this.scauneErgonomica = scauneErgonomica;
        this.decorareaMesei = decorareaMesei;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.genMuzica = genMuzica;
    }

    public Rezervare() {

    }

    protected void setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
    }

    protected void setScauneErgonomica(boolean scauneErgonomica) {
        this.scauneErgonomica = scauneErgonomica;
    }

    protected void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    protected void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    protected void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareLaGeam=" + asezareLaGeam +
                ", scauneErgonomica=" + scauneErgonomica +
                ", decorareaMesei=" + decorareaMesei +
                ", muzicaAmbientalaPersonalizata=" + muzicaAmbientalaPersonalizata +
                ", genMuzica=" + genMuzica +
                '}';
    }
}
