package main;

import clase.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiuneBazaDeDate = ConexiuneBazaDeDate.getInstance("Baza de date clienti", "https://www.example.com/?bubble=bells", 10);
        ConexiuneBazaDeDate conexiuneBazaDeDate2 = ConexiuneBazaDeDate.getInstance("Baza de date masini", "https://www.example.com/?bubbldawdadwawde=bells", 5);

        System.out.println( conexiuneBazaDeDate.toString() );
        System.out.println( conexiuneBazaDeDate2.toString() );
    }
}