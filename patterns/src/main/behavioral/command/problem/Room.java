package main.behavioral.command.problem;

public class Room {
    private final Light light;

    public Room() {
        this.light = new Light();
    }

    public void switchLights() {
        if (!light.isSwitchedOn()) {
            System.out.println("Switching on light");
            light.setSwitchedOn();
        } else {
            System.out.println("Switching off light");
            light.setSwitchedOff();
        }
    }
}
