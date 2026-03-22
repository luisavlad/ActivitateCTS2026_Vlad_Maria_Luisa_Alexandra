package ro.ase.cts.factory_method.clase;

public abstract class Desert implements FelMancare {
    protected float pret;
    protected float gramaj;
    protected int calorii;

    public Desert(float pret, float gramaj, int calorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(calorii);
        return sb.toString();
    }
}
