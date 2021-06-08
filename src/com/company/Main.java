package com.company;

public class Main {

    public static void main(String[] args) {
        Red1 red1 = new Red1();
        // using all kinds of objects
        red1.addLast(2);
        red1.addLast(3);
        red1.addLast(new String("Hello "));
        red1.addLast(new String("world!"));
        red1.addLast(1);
        red1.addLast(2);

        red1.addFirst(0);
        red1.addFirst(1);

        red1.addLast(new Cylinder(1, 2));
        red1.addFirst(new Cylinder(2, 3));

        System.out.println(red1);

        // using specific objects via ussage of generic classes
        Red2<Cylinder> red2 = new Red2<Cylinder>();

        // in order to avoid exceptions, note that objects[] has more types than just Cylinder objects, we must use try/catch block
        try {
            for (Object o : objects) {
                red2.addLast((Cylinder) o); // without the encapsulation, toString() works perfectly fine with all of the elements
            }
        } catch (ClassCastException e) {
            System.err.println("Invalid type: " + e.toString());
        }
        System.out.println(red2);
    }

    public static Object[] objects = {new Cylinder(5, 6), "Hello world!", 3.14, 5, new Cylinder(7, 8)};
}


