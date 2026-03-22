package ro.ase.cts.main;

import ro.ase.cts.builder01.AbstractBuilder;
import ro.ase.cts.builder01.Internare;
import ro.ase.cts.builder01.InternareBuilder;
import ro.ase.cts.builder02.AbstractBuilder02;
import ro.ase.cts.builder02.InternareBuilder02;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Georgel");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare2.setNumePacient("Georgica");
        internare2.setHalat(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");

        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setArePapuci(true).setNume("Gigel").build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder02 builder2 = new InternareBuilder02();
        builder2.setAreMicDejun(true);
        ro.ase.cts.builder02.Internare internare5 = builder2.build("Georgica");
        ro.ase.cts.builder02.Internare internare6 = builder2.build("Gigel");

        internare5.setHalat(true);

        // a treia varianta de builder este cea in care InternareBuilder se afla in clasa Internare
    }
}
