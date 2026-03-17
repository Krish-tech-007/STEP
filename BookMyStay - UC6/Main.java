import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) {
        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 2);
        inventory.addRoomType("Suite", 1);

        Queue<Reservation> bookingQueue = new LinkedList<>();
        bookingQueue.add(new Reservation("Abhi", "Single"));
        bookingQueue.add(new Reservation("Subha", "Single"));
        bookingQueue.add(new Reservation("Vanmathi", "Suite"));

        RoomAllocationService service = new RoomAllocationService();

        System.out.println("Room Allocation Processing");
        while (!bookingQueue.isEmpty()) {
            Reservation reservation = bookingQueue.poll();
            service.allocateRoom(reservation, inventory);
        }
    }
}

