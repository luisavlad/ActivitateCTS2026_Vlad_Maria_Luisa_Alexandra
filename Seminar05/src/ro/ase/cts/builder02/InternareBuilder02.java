package ro.ase.cts.builder02;

public class InternareBuilder02 implements AbstractBuilder02 {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halat;

    public InternareBuilder02() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    @Override
    public Internare build(String nume) {
        return new Internare(patRabatabil, micDejunInclus, papuciCamera, halat, nume);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public AbstractBuilder02 setArePapuci(boolean arePapuci) {
        this.papuciCamera = arePapuci;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreMicDejun(boolean micDejun) {
        this.micDejunInclus = micDejun;
        return this;
    }

    @Override
    public AbstractBuilder02 setAreHalat(boolean halat) {
        this.halat = halat;
        return this;
    }
}
