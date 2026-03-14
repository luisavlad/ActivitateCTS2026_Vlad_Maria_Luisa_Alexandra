package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AplicantiReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantiReader {
	@Override
	public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(file));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (input2.hasNext()) {
			Angajat a = new Angajat();

			super.readAplicant(input2,a);

			int salariu = input2.nextInt();
			String ocupatie = input2.next();

			a.setOcupatie(ocupatie);
			a.setSalariu(salariu);

			angajati.add(a);
		}
		input2.close();
		return angajati;
	}
}
