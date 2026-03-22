package ro.ase.cts.factory_method.fabrici;

import ro.ase.cts.factory_method.clase.FelMancare;
import ro.ase.cts.factory_method.clase.SupaCiuperci;
import ro.ase.cts.factory_method.clase.SupaLegume;
import ro.ase.cts.factory_method.enums.TipMancare;
import ro.ase.cts.factory_method.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta {
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if (tipMancare == TipSupa.LEGUME) {
            return new SupaLegume(pret, gramaj);
        } else if (tipMancare == TipSupa.CIUPERCI) {
            return new SupaCiuperci(pret, gramaj);
        }

        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return getFelMancare(tipMancare, pret, gramaj);
    }
}
