package creational.singleton;


import creational.singleton.singleton_enum.SingletonEnum;
import creational.singleton.singleton_without_enum.SingletonClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    /*
     * Singleton without enumerations
     *      One way to create singleton class is with private constructor and static method getInstance().
     *      You can see that example in package 'singleton_without_enum'.
     *      This is not the best way because you can make more instances using Java reflection shown below.
     *
     * Singleton using enumerations
     *      Another and better way to create singleton is using enumerations.
     *      You can see that example in package 'singleton_enum'.
     */

    public static void main(String[] args) {

        // Okay, this works fine...
        SingletonClass A = SingletonClass.getInstance();
        System.out.println("Class A: " + A.getAttribute());
        A.setAttribute("dmarjanovic");
        System.out.println("Class A: " + A.getAttribute());

        SingletonClass B = SingletonClass.getInstance();
        System.out.println("Class B: " + B.getAttribute());

        // But, check this now...
        try {
            Class cls = Class.forName(SingletonClass.class.getName());
            Constructor[] constructors = cls.getDeclaredConstructors();
            constructors[0].setAccessible(true);
            SingletonClass C = (SingletonClass) constructors[0].newInstance();

            System.out.println("Class C: " + C.getAttribute() + "\n");
            // Yeah, we get new instance using reflection...
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // Example using enum singleton
        SingletonEnum.INSTANCE.printHelloMessage();

        System.out.println(SingletonEnum.INSTANCE.getMessage());
        SingletonEnum.INSTANCE.setMessage("Hello from the other side!");
        System.out.println(SingletonEnum.INSTANCE.getMessage());

    }

}
