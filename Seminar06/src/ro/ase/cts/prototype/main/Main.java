package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Rezervare;
import ro.ase.cts.prototype.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1 = new Rezervare("Gica", 20, 5, "071234567");
        Rezervare rez2 = (Rezervare) rez1.clone();

        rez2.setOraRezervare(10);
        rez2.setZiRezervare(15);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}