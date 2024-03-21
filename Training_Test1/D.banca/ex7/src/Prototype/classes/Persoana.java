package Prototype.classes;

public class Persoana {
    private int varsta;
    private boolean urmaritDePolitie;
    private boolean createLaAlteBanci;

    public Persoana(int varsta, boolean urmaritDePolitie, boolean createLaAlteBanci) {
        this.varsta = varsta;
        this.urmaritDePolitie = urmaritDePolitie;
        this.createLaAlteBanci = createLaAlteBanci;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isUrmaritDePolitie() {
        return urmaritDePolitie;
    }

    public boolean isCreateLaAlteBanci() {
        return createLaAlteBanci;
    }
}
