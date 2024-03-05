package clase;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {
    private String numeExamen;
    Map<Integer, Student> mapStudenti = new HashMap<>(); // dependency inversion

    public SustinereExamen(String numeExamen) {
        this.numeExamen = numeExamen;
    }

    public String getNumeExamen() {
        return numeExamen;
    }

    public Map<Integer, Student> getMap() {
        return mapStudenti;
    }

    public void inregistrareStudent(Student student) {
        // map.putIfAbsent(student.getId(), student);
        if (mapStudenti.containsKey(student.getId())) {
            System.out.println("Studentul " + student.getNume() + " a sustinut deja examenul de " + numeExamen);
        } else {
            mapStudenti.put(student.getId(), student);
            System.out.println("Studentul " + student.getNume() + " sustine acum examenul de " + numeExamen);
        }
    }  // singleton registry
}
