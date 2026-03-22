package ro.ase.cts.builder01;

public class InternareBuilder implements AbstractBuilder {
    private Internare internare;

    public InternareBuilder(String numePacient) {
        internare = new Internare(false, false, false, false, numePacient);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String numePacient) {
        this.internare.setNumePacient(numePacient);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean patRabatabil) {
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean arePapuci) {
        this.internare.setPapuciCamera(arePapuci);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean micDejun) {
        this.internare.setMicDejunInclus(micDejun);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }
}
