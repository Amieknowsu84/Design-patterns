package main.behavioral.command.problem;

public class CommandDriver {

    public static void main(String[] args) {
        House house = new House();
        house.addRoom(new LivingRoom());
        house.addRoom(new BedRoom());
        house.rooms.forEach(Room::switchLights);
    }

}
