package Builder_v1.classes;

public class ContBuilder implements Builder {

    Cont cont;

    public ContBuilder() {
        cont = new Cont(false, false, false);
    }

    public ContBuilder setPrimesteSalariul(boolean primesteSalariul) {
        this.cont.setPrimesteSalariul(primesteSalariul);
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.cont.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.cont.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public Cont build() {
        return cont;
    }
}
