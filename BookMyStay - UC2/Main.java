
public class Main{
    public static void main(String args[]){
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("Hotel Room Initialization\n");

        single.display();
        System.out.println("Available: " + singleAvailable + "\n");

        doubleRoom.display();
        System.out.println("Available: " + doubleAvailable + "\n");

        suite.display();
        System.out.println("Available: " + suiteAvailable);
    }
}

