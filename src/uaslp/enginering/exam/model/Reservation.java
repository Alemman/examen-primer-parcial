package uaslp.enginering.exam.model;

public class Reservation {
    private int roomNumber;
    private String date;
    private Guest guest;
    private int nights;

    public void setRoomNumber(int roomNumber){
    this.roomNumber = roomNumber;
    }

    public void setArrivalDate(String date){
        this.date=date;
    }
    public void setGuest(Guest guest){
        this.guest = guest;
    }
    public void setNights(int nights){
        this.nights = nights;
    }
}
