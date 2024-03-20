package Builder_v2.classes;

public class ContBuilder implements Builder {
    private boolean primesteSalariul = false;
    private boolean cardAtasat = false;
    private boolean internetBanking = false;

    public ContBuilder setPrimesteSalariul(boolean primesteSalariul) {
        this.primesteSalariul = primesteSalariul;
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }


    @Override
    public Cont build() {
        return new Cont(primesteSalariul, cardAtasat, internetBanking);
    }
}
