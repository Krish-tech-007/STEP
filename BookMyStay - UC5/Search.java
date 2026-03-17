public class Search{
    RoomInventory roomObj;
    public Search(RoomInventory roomObj){
        this.roomObj = roomObj;
    }
    public void display() {
        System.out.println("Current Room Inventory:");
        for (String type : roomObj.roomAvailability.keySet()) {
            if (roomObj.roomAvailability.get(type) > 0) {
                System.out.println(type + " Available: " + roomObj.roomAvailability.get(type));
            }
        }
    }

}
