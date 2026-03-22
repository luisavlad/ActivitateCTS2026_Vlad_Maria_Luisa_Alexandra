package ro.ase.cts.factory_method.fabrici;

import ro.ase.cts.factory_method.clase.FelMancare;
import ro.ase.cts.factory_method.enums.TipMancare;

public interface FabricaAbstracta {
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}
