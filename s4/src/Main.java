import FactoryMethod.classes.PersonalSpital;
import FactoryMethod.classes.factory.*;


public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu) {
        PersonalSpital personalSpital = fabricaPersonal.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }
    public static void main(String[] args) throws Exception {

        // SimpleFactory
//        FabricaPersonal fabricaPersonal = new FabricaPersonal();
//        PersonalSpital medic = fabricaPersonal.createPersonal(TipPersonal.MEDIC, "gigel", 7000);
//        PersonalSpital asistent = fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "ionel", 5000);
//        PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "mirel", 4000);
//        medic.afisareDetalii();
//        asistent.afisareDetalii();
//        brancardier.afisareDetalii();

        // FactoryMethod
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaInfirmier = new FabricaInfirmier();
        FabricaPersonal fabricaBancardier = new FabricaBrancardier();

        PersonalSpital medic = fabricaMedic.createPersonal("gigel", 7000);
        PersonalSpital infirmier = fabricaInfirmier.createPersonal("ionel", 5000);
        PersonalSpital brancardier = fabricaBancardier.createPersonal("mirel", 4000);

        prelucrarePersonal(new FabricaMedic(), "dorel", 6000);
        prelucrarePersonal(new FabricaAsistent(), "dorel", 6000);
    }
}