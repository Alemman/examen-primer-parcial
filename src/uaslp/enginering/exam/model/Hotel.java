package uaslp.enginering.exam.model;
import uaslp.enginering.exam.model.Reservation;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private Reservation r;


    public Hotel() {
        reservations = new ArrayList<Reservation>();
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public void addRoom (Room room){

    }

    public getRoomNumber(){
        return;
    }
    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
