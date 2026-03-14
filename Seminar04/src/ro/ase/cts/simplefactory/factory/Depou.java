package ro.ase.cts.simplefactory.factory;

import ro.ase.cts.simplefactory.clase.Autobuz;
import ro.ase.cts.simplefactory.clase.MijlocTransport;
import ro.ase.cts.simplefactory.clase.Tramvai;
import ro.ase.cts.simplefactory.clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(TipMijlocTransport tip, int nrRoti, String nrInmatriculare) {
        if (tip == TipMijlocTransport.AUTOBUZ) {
            return new Autobuz(nrRoti, nrInmatriculare);
        }
        if (tip == TipMijlocTransport.TRAMVAI) {
            return new Tramvai(nrRoti, nrInmatriculare);
        }
        if (tip == TipMijlocTransport.TROLEIBUZ) {
            return new Troleibuz(nrRoti, nrInmatriculare);
        }

        return null;
    }
}
