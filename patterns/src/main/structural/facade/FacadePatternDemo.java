package main.structural.facade;

// Complex subsystems

// Facade

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
