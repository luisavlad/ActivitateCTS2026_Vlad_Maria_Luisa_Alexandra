package ro.ase.cts.factory_method.clase;

public abstract class Supa implements FelMancare {
    protected float pret;
    protected float gramaj;

    public Supa(float pret, float gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        return sb.toString();
    }
}
