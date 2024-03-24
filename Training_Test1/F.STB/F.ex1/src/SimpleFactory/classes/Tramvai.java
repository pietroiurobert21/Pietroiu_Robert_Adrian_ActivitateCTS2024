package SimpleFactory.classes;

public class Tramvai extends MijlocDeTransport {
    public Tramvai(double pretBiet, String program) {
        super(pretBiet, program);
    }

    public Tramvai() {
    }
    @Override
    public String toString() {
        return "Tramvai{" +
                "pretBiet=" + super.getPretBiet() +
                ", program='" + super.getProgram() + '\'' +
                '}';
    }
}
