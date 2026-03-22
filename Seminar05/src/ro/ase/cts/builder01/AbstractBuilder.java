package ro.ase.cts.builder01;

public interface AbstractBuilder {
    Internare build();

    AbstractBuilder setNume(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setArePapuci(boolean arePapuci);
    AbstractBuilder setAreMicDejun(boolean micDejun);
    AbstractBuilder setAreHalat(boolean halat);
}
