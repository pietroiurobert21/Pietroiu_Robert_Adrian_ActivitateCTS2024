package Prototype.classes;

public class ContBancar implements Prototype {
    private int nrCont;
    private Persoana detinatorCont;

    public ContBancar(int nrCont, Persoana detinatorCont) throws Exception {
        if (!detinatorCont.isCreateLaAlteBanci() && !detinatorCont.isUrmaritDePolitie()) {
            this.detinatorCont = detinatorCont;
            this.nrCont = nrCont;
        } else throw new Exception("Persoana nu poate deschide cont!");
    }

    public void setNrCont(int nrCont) {
        this.nrCont = nrCont;
    }

    @Override
    public ContBancar clone() {
        try {
            return new ContBancar(nrCont, detinatorCont);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "nrCont=" + nrCont +
                ", detinatorCont=" + detinatorCont +
                '}';
    }
}
