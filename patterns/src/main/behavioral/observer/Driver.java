package main.behavioral.observer;

public class Driver {
    /*
     you are building a weather monitoring application.
     The application should display current weather information,
     and users can subscribe to receive updates whenever the weather conditions change.
     */
    public static void main(String[] args){
       Weather weather = new Weather(27,"Normal Temperature.");
       //These observers can be done by concrete class as well.
       Observer mobile = (temperature,remarks)->System.out.println("mobile update Temperature is "+temperature+" remarks "+remarks);
       Observer smartwatch = (temperature,remarks)->System.out.println("smartwatch update Temperature is "+temperature+" remarks "+remarks);
       weather.addObserver(mobile);
       weather.addObserver(smartwatch);
       weather.reportChange(2,"Its Cold there");
    }

}
