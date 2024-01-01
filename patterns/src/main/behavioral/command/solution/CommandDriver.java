package main.behavioral.command.solution;


import main.behavioral.command.problem.House;
import main.behavioral.command.problem.Light;

public class CommandDriver {

    public static void main(String[] args) {
        Room livingRoom = new LivingRoom();
        SwitchLightCommand switchLightCommand = new SwitchLightCommand(new Light());
        livingRoom.setLightCommand(switchLightCommand);
        livingRoom.switchLights();
        livingRoom.switchLights();
    }

}
