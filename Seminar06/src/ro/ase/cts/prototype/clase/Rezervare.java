package ro.ase.cts.prototype.clase;

public class Rezervare implements RezervareAbstracta {
    protected String numeClient;
    protected int oraRezervare;
    protected int ziRezervare;
    protected String nrTelefon;

    public Rezervare() {
    }

    public Rezervare(String numeClient, int oraRezervare, int ziRezervare, String nrTelefon) {
        if (numeClient.length() > 1) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Gigica";
        }

        if (oraRezervare < 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        } else {
            this.oraRezervare = 9;
        }

        if (ziRezervare < 30) {
            this.ziRezervare = ziRezervare;
        } else {
            this.ziRezervare = 1;
        }

        if (nrTelefon.length() < 10) {
            this.nrTelefon = nrTelefon;
        } else {
            this.nrTelefon = "0700000000";
        }
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziRezervare = this.ziRezervare;
        rezervareNoua.nrTelefon = this.nrTelefon;

        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziRezervare=").append(ziRezervare);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setZiRezervare(int ziRezervare) {
        this.ziRezervare = ziRezervare;
    }

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }
}
