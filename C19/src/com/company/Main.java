package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /* Se desea persistir un listado de contactos en un archivo. Los contactos tienen un nombre, un mail y un
        teléfono. Para ello, te proponemos probar en el método main guardar toda la colección de contactos en un
        archivo y luego recuperar en otra colección el contenido del archivo para mostrar la colección por consola.*/
    public static void main(String[] args) {
	// write your code here
        Contacto c1 =  new Contacto("Zoe", "zxe@asd.com", 123);
        Contacto c2 =  new Contacto("Gloria", "miau@asd.com", 222);

        List<Contacto> listaContactos = new ArrayList<>();

        listaContactos.add(c1);
        listaContactos.add(c2);

        FileOutputStream fo;

        try {
            fo=new FileOutputStream("contactos.txt");
            ObjectOutputStream dos =new ObjectOutputStream(fo);

            dos.writeObject(listaContactos);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileInputStream fis = null;
        List<Contacto> listaContactos2 = null;

        try {
            fis = new FileInputStream("contactos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaContactos2 = (ArrayList) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Contacto c : listaContactos2) {
            System.out.println(c.getNombre() + " " + c.getMail() + " " + c.getTelefono());
        }

    }
}
