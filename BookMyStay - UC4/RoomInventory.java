import java.util.HashMap;
public class RoomInventory {
    HashMap<String, Integer>  roomAvailability;

    public RoomInventory(){
        roomAvailability = new HashMap<>();
    }

    public void initialize(String type, int available){
        roomAvailability.put(type, available);
    }

    public int getAvailability(String type){
        return roomAvailability.get(type);
    }

    public void updateAvailibility(String type, int available){
        if (roomAvailability.containsKey(type)) {
            roomAvailability.put(type, available);
        }
    }

    public void display() {
        System.out.println("Current Room Inventory:");
        for (String type : roomAvailability.keySet()) {
            System.out.println(type + " Available: " + roomAvailability.get(type));
        }
    }


}
