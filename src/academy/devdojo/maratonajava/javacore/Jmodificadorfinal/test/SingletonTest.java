package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.model.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Foo");
        System.out.println(singleton.value);

        Singleton anotherSingleton = Singleton.getInstance("Bar");
        System.out.println(anotherSingleton.value);
    }
}
