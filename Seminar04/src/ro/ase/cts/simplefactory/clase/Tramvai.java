package ro.ase.cts.simplefactory.clase;

public class Tramvai extends MijlocTransport {
    public Tramvai(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tramvaiul ");
        builder.append(super.nrInmatriculare);
        builder.append(" are ");
        builder.append(super.nrRoti);
        builder.append(" roti.");

        System.out.println(builder);
    }
}
