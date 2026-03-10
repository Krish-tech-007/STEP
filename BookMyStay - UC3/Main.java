
public class Main{
    public static void main(String args[]){
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        Room single = new SingleRoom();
        Room doubleR = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();
        inventory.initialize("Single Room", single.beds);
        inventory.initialize("Double Room", doubleR.beds);
        inventory.initialize("Suite Room", suite.beds);
        System.out.println("Hotel Room Initialization\n");

        single.display();
        System.out.println("Available: " + singleAvailable + "\n");

        doubleR.display();
        System.out.println("Available: " + doubleAvailable + "\n");

        suite.display();
        System.out.println("Available: " + suiteAvailable);
        
        inventory.display();
    }
}

