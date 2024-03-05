package main;

import clase.ConexiuneBazaDeDate;
import clase.Student;
import clase.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        // ex1
        ConexiuneBazaDeDate conexiuneBazaDeDate = ConexiuneBazaDeDate.getInstance("Baza de date clienti", "https://www.example.com/?bubble=bells", 10);
        ConexiuneBazaDeDate conexiuneBazaDeDate2 = ConexiuneBazaDeDate.getInstance("Baza de date masini", "https://www.example.com/?bubbldawdadwawde=bells", 5);

        conexiuneBazaDeDate2.setDenumire("alta baza de date");

//        System.out.println( conexiuneBazaDeDate.toString() );
//        System.out.println( conexiuneBazaDeDate2.toString() );

        // ex2
        Student student1 = new Student(1, "gigel");
        Student student2 = new Student(2, "ionel");
        Student student3 = new Student(3, "mirel");
        Student student4 = new Student(4, "dorel");
        SustinereExamen sustinereExamenCTS = new SustinereExamen("CTS");
        SustinereExamen sustinereExamenPOO = new SustinereExamen("POO");

        sustinereExamenCTS.inregistrareStudent(student1);
        sustinereExamenCTS.inregistrareStudent(student2);
        sustinereExamenCTS.inregistrareStudent(student2);
        sustinereExamenCTS.inregistrareStudent(student3);
        sustinereExamenCTS.inregistrareStudent(student4);

        sustinereExamenPOO.inregistrareStudent(student1);
        sustinereExamenPOO.inregistrareStudent(student2);
        sustinereExamenPOO.inregistrareStudent(student3);
        sustinereExamenPOO.inregistrareStudent(student3);
        sustinereExamenPOO.inregistrareStudent(student4);
    }
}