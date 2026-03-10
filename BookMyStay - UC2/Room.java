
    public abstract class Room {
        // fields/instance variables
        int beds;
        int size;
        double price;

        // constructor (optional, called by subclasses)
        public Room(int beds, int size, double price) {
            this.beds = beds;
            this.size = size;
            this.price = price;
        }

        public void display(){
            System.out.println("Room details are as follows");
            System.out.println("Number of beds = " + this.beds);
            System.out.println("Sq. ft = " + this.size);
            System.out.println("Price = " + this.price);
        }
    }


