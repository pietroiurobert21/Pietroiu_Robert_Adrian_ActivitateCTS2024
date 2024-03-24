package SimpleFactory.classes;

public abstract class MijlocDeTransport {
    private double pretBiet;
    private String program;

    public MijlocDeTransport(double pretBiet, String program) {
        this.pretBiet = pretBiet;
        this.program = program;
    }

    public MijlocDeTransport() {
    }

    public double getPretBiet() {
        return pretBiet;
    }

    public void setPretBiet(double pretBiet) {
        this.pretBiet = pretBiet;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
