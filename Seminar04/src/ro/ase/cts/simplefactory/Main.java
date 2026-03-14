package ro.ase.cts.simplefactory;

import ro.ase.cts.simplefactory.clase.MijlocTransport;
import ro.ase.cts.simplefactory.factory.Depou;
import ro.ase.cts.simplefactory.factory.TipMijlocTransport;

public class Main {
	public static void main(String[] args) {
		Depou depou = new Depou();
		MijlocTransport autobuz = depou.getMijlocTransport(TipMijlocTransport.AUTOBUZ, 4, "B17CHH");
		MijlocTransport tramvai = depou.getMijlocTransport(TipMijlocTransport.TRAMVAI, 16, "B07TLE");
		MijlocTransport troleibuz = depou.getMijlocTransport(TipMijlocTransport.TROLEIBUZ, 4, "B01ERU");

		autobuz.afiseazaDetalii();
		tramvai.afiseazaDetalii();
		troleibuz.afiseazaDetalii();
	}
}
