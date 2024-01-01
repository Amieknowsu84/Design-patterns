package main.behavioral.command.problem;

public class Light {
    private boolean switchedOn;

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn() {
        switchedOn = true;
    }

    public void setSwitchedOff() {
        switchedOn = false;
    }

    public void switchLights(){
        System.out.println(switchedOn+" "+!switchedOn);
        switchedOn = !switchedOn;
    }

}
