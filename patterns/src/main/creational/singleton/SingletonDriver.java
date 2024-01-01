package main.creational.singleton;

public class SingletonDriver {

    public static void main(String[] args) {
        Singleton object1 = Singleton.getSingleton("new");
        Singleton object2 = Singleton.getSingleton("new1");
        System.out.println(object1.equals(object2));
        System.out.println(object1);
        System.out.println(object2);
        System.out.println(object1.getData());
        System.out.println(object2.getData());
    }
}
