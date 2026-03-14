package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = Hotel.getInstance("Marriott", 7, 5);
        Hotel megaHotel = Hotel.getInstance("MegaHotel", 200, 0);

        hotel.rezervaCamera();
        megaHotel.rezervaCamera();

        hotel.rezervaCamera();
        megaHotel.rezervaCamera();

        System.out.println("Hotelul este ocupat in proportie de " + hotel.afiseazaGradulDeOcupare() + "%.");
    }
}
