import java.util.Date;

public class Room {
    Brother owner;
    double squareOfRoom;

public Room() {
        }

public Room( Brother owner, double squareOfRoom) {
    this.owner = owner;
    this.squareOfRoom = squareOfRoom;
}

    public Room(String tom, int squareOfRoom) {
    }

    public static void main(String[] args) {
        Room bedroom = new Room("Tom", 30);
        System.out.println(bedroom.owner);
        System.out.println(bedroom.squareOfRoom);
    }

}

