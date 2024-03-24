package main.structural.facade;

class Amplifier {
    void on() {
        System.out.println("Amplifier is on");
    }

    void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

    void off() {
        System.out.println("Amplifier is off");
    }
}
