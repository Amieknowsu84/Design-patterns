package main.behavioral.command.solution;

public class Room {
    private Command lightCommand;

    public Room() {
    }

    public void setLightCommand(Command lightCommand) {
        this.lightCommand = lightCommand;
    }

    public void switchLights() {
        lightCommand.execute();
    }
}
