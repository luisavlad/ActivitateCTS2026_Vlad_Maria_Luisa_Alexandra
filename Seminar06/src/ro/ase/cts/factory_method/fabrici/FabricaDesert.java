package ro.ase.cts.factory_method.fabrici;

import ro.ase.cts.factory_method.clase.Clatita;
import ro.ase.cts.factory_method.clase.FelMancare;
import ro.ase.cts.factory_method.clase.Papanasi;
import ro.ase.cts.factory_method.enums.TipDesert;
import ro.ase.cts.factory_method.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta {
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare, pret, gramaj, 500);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if (tipMancare == TipDesert.PAPANASI) {
            return new Papanasi(pret, gramaj, calorii);
        } else if (tipMancare == TipDesert.CLATITE) {
            return new Clatita(pret, gramaj, calorii);
        }

        return null;
    }
}
