package ro.ase.cts.factory_method.clase;

public class SupaLegume extends  Supa {
    public SupaLegume(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de legume are ").append(super.toString());
        System.out.println(sb);
    }
}
