package main.creational;

public class Singleton {
    private static volatile Singleton singleton;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getSingleton(String data) {
        Singleton result = singleton;
        if (result == null) {
            synchronized (Singleton.class) {
                result = singleton;
                if (result == null) {
                    result = singleton = new Singleton(data);
                }
            }
        }
        return result;
    }
}
