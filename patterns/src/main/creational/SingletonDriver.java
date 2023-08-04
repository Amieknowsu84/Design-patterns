package main.creational;

public class SingletonDriver {

    public static void main(String a[]){
        Singleton object1=Singleton.getSingleton("new");
        Singleton object2=Singleton.getSingleton("new1");
        System.out.println(object1.equals(object2));
        System.out.println(object1);
        System.out.println(object2);
    }
}
