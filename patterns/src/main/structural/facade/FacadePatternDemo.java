package main.structural.facade;

// Complex subsystems

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

class Projector {
    void on() {
        System.out.println("Projector is on");
    }

    void wideScreenMode() {
        System.out.println("Projector is in widescreen mode");
    }

    void off() {
        System.out.println("Projector is off");
    }
}

// Facade

class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        projector.wideScreenMode();
    }

    void endMovie() {
        System.out.println("Shutting down the home theater...");
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.off();
        projector.off();
    }
}

// Client code

public class FacadePatternDemo {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector);

        homeTheater.watchMovie("The Matrix");
        System.out.println();
        homeTheater.endMovie();
    }
}
