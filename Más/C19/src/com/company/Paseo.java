package com.company;

import java.io.*;
import java.util.ArrayList;

public class Paseo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Perro perro1 = new Perro("Juan", "Nose", 2, "asd");
        Perro perro2 = new Perro("Kasdasd", "Nose2", 9, "sarasasasa");
        Perro perro3 = new Perro("Zoe", "San bernardo", 5, "nienienie");
        Perro perro4 = new Perro("Zoasdasde", "San asdasdasdo", 1, "aaaaaa");
        Perro perro5 = new Perro("Zoezzzzzz", "San zzzzz", 8, "zzzzz");

        ArrayList<Perro> lunes = new ArrayList<Perro>();
        ArrayList<Perro> martes = new ArrayList<Perro>();
        ArrayList<Perro> miercoles = new ArrayList<Perro>();
        ArrayList<Perro> jueves = new ArrayList<Perro>();
        ArrayList<Perro> viernes = new ArrayList<Perro>();

        lunes.add(perro1);
        lunes.add(perro2);
        martes.add(perro2);
        martes.add(perro3);
        miercoles.add(perro3);
        miercoles.add(perro4);
        jueves.add(perro4);
        jueves.add(perro5);
        viernes.add(perro5);
        viernes.add(perro1);


        FileOutputStream fos = new FileOutputStream("perros.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(lunes);
        oos.writeObject(martes);
        oos.writeObject(miercoles);
        oos.writeObject(jueves);
        oos.writeObject(viernes);

        oos.close();

        FileInputStream fis =  new FileInputStream("perros.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Perro> perros2;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Dia : " + i);
            System.out.println("_______________");
            perros2 = (ArrayList<Perro>) ois.readObject();
            for (Perro p : perros2) {
                System.out.println(p);

            }
        }

        ois.close();

    }






}
