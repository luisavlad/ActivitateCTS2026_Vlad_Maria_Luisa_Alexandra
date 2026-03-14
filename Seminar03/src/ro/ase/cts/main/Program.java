package ro.ase.cts.main;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AngajatiReader;
import ro.ase.cts.clase.readere.AplicantiReader;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantiReader angajatiReader = new AngajatiReader();
		try {
			listaAngajati = angajatiReader.readAplicanti("Seminar02/angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block			e.printStackTrace();
		}
	}

}

