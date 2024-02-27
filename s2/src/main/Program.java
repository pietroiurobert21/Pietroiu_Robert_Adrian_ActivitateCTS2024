package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.*;
import clase.readers.classes.AngajatReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AngajatReader angajatReader = new AngajatReader();
			listaAngajati = angajatReader.read("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
