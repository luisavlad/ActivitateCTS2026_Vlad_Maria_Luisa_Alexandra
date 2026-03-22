package ro.ase.cts.factory_method.main;

import ro.ase.cts.factory_method.clase.FelMancare;
import ro.ase.cts.factory_method.enums.TipDesert;
import ro.ase.cts.factory_method.enums.TipSupa;
import ro.ase.cts.factory_method.fabrici.FabricaDesert;
import ro.ase.cts.factory_method.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15.5f, 200.0f);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 14.25f, 250.0f);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 20.5f, 200.5f, 250);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 24.85f, 300.0f, 560);

        supaCiuperci.afisare();
        supaLegume.afisare();

        clatite.afisare();
        papanasi.afisare();
    }
}