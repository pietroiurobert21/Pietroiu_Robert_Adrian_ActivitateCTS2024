package Prototype.classes;

public class ContBancar implements ContAbstract {
    private String CNP;
    private int numarCard;

    public ContBancar(String CNP, int numarCard) throws Exception {
        if (CNP.length() == 13)
            this.CNP = CNP;
        if (numarCard > 999 && numarCard < 10000)
            this.numarCard = numarCard;
        else throw new Exception("datele furnizate sunt eronate!");
    }

    public ContBancar() {
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    @Override
    public void setNumarCard(int numarCard) {
        this.numarCard = numarCard;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "CNP='" + CNP + '\'' +
                ", numarCard=" + numarCard +
                '}';
    }

    @Override
    public ContAbstract clone() {
        ContBancar contBancarNou = new ContBancar();
        try {
            contBancarNou = new ContBancar(this.CNP, this.numarCard);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return contBancarNou;
    }
}