package ro.ase.cts.simplefactory.clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Troleibuzul ");
        builder.append(super.nrInmatriculare);
        builder.append(" are ");
        builder.append(super.nrRoti);
        builder.append(" roti.");

        System.out.println(builder);
    }
}
