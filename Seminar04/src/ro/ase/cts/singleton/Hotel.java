package ro.ase.cts.singleton;

public class Hotel {
    private String numeHotel;
    private int nrCamere;
    private int nrCamereOcupate;

    private static Hotel instanta = null;

    private Hotel(String numeHotel, int nrCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.nrCamere = nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int nrCamere, int nrCamereOcupate) {
        if (instanta == null) {
            instanta = new Hotel(numeHotel, nrCamere, nrCamereOcupate);
        }

        return instanta;
    }

    public void rezervaCamera() {
        if (this.nrCamereOcupate < this.nrCamere) {
            this.nrCamereOcupate++;
            System.out.println("Camera a fost rezervata cu succes!");
        }
        else {
            System.out.println("Nu mai sunt camere disponibile!");
        }
    }

    public void afiseazaDetaliiHotel() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hotelul ");
        builder.append(this.numeHotel);
        builder.append(" are ");
        builder.append(this.nrCamere);
        builder.append(" camere in total, dintre care ");
        builder.append(this.nrCamereOcupate);
        builder.append(" sunt ocupate.");

        System.out.println(builder);
    }

    public void elibereazaCamera() {
        if (this.nrCamereOcupate > 0) {
            this.nrCamereOcupate--;
            System.out.println("Camera a fost eliberata cu succes!");
        }
        else {
            System.out.println("Nu exista nicio camera ocupata!");
        }
    }

    public int afiseazaGradulDeOcupare() {
        return this.nrCamereOcupate * 100 / this.nrCamere;
    }
}
