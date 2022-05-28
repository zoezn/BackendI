package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RopaFactory factory = new RopaFactory();


        factory.getRopa("S", "Pantalon", true, true);
        factory.getRopa("S", "Pantalon", true, true);
        factory.getRopa("S", "Pantalon", true, true);
        factory.getRopa("M", "Remera", true, false);

        System.out.println(factory.getContador());


    }
}
