package main.structural.facade;

class DvdPlayer {
    void on() {
        System.out.println("DVD Player is on");
    }

    void play(String movie) {
        System.out.println("Playing DVD: " + movie);
    }

    void stop() {
        System.out.println("DVD Player stopped");
    }

    void off() {
        System.out.println("DVD Player is off");
    }
}
