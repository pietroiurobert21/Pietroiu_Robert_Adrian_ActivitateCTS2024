package Builder_v1.classes;

public class Cont {
    private boolean primesteSalariul;
    private boolean cardAtasat;
    private boolean internetBanking;

    public Cont(boolean primesteSalariul, boolean cardAtasat, boolean internetBanking) {
        this.primesteSalariul = primesteSalariul;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    void setPrimesteSalariul(boolean primesteSalariul) {
        this.primesteSalariul = primesteSalariul;
    }

    void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "primesteSalariul=" + primesteSalariul +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }
}
