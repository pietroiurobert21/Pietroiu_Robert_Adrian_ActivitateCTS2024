package SimpleFactory.classes;

public class Autobuz extends MijlocDeTransport {
    public Autobuz(double pretBiet, String program) {
        super(pretBiet, program);
    }

    public Autobuz() {
    }
    @Override
    public String toString() {
        return "Autobuz{" +
                "pretBiet=" + super.getPretBiet() +
                ", program='" + super.getProgram() + '\'' +
                '}';
    }
}
