package SimpleFactory.classes;

public class Troleibuz extends MijlocDeTransport {
    public Troleibuz(double pretBiet, String program) {
        super(pretBiet, program);
    }

    public Troleibuz() {
    }
    @Override
    public String toString() {
        return "Troleibuz{" +
                "pretBiet=" + super.getPretBiet() +
                ", program='" + super.getProgram() + '\'' +
                '}';
    }
}
