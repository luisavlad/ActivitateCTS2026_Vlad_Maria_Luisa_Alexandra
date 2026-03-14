package ro.ase.cts.simplefactory.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Autobuzul ");
        builder.append(super.nrInmatriculare);
        builder.append(" are ");
        builder.append(super.nrRoti);
        builder.append(" roti.");

        System.out.println(builder);
    }
}
