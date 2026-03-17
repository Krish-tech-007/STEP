
public class Main{
    public static void main(String args[]){
        BookingRequestQueue bq = new BookingRequestQueue();
        System.out.println("Booking request queue");
        Reservation r1 = new Reservation("Ron","Suite");
        Reservation r2 = new Reservation("James","Single Room");
        Reservation r3 = new Reservation("Rene","Double Room");

        bq.addRequest(r1);
        bq.addRequest(r2);
        bq.addRequest(r3);

        while(bq.hasPendingRequest()){
            Reservation r = bq.getNextRequest();
            System.out.println(r.getGuestName() + ": " + r.getRoomType());
        }
    }
}

