package com.dh.empresa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Bla", 123);

        Empleado e1= new Empleado("Zoe", "Jimenez", 222, 20000);
        Empleado e2= new Empleado("Azul", "Qwerty", 444, 40000);
        Empleado e3= new Empleado("Celeste", "Wasd", 666, 60000);
        Empleado e4= new Empleado("Violeta", "Abcde", 888, 80000);


        empresa.agregarEmpleados(e1);
        empresa.agregarEmpleados(e2);
        empresa.agregarEmpleados(e3);
        empresa.agregarEmpleados(e4);

        FileOutputStream fos;

        try {
            fos =  new FileOutputStream("empleados.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(empresa.getListaEmpleados());

            /*OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write(empresa.getListaEmpleados());

            for (Empleado e : empresa.getListaEmpleados()) {
                osw.write(e.toString());
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = null;
        List<Empleado> listaEmpleados2 = null;

        try {
            fis = new FileInputStream("empleados.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            listaEmpleados2 = (ArrayList) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Empleado e : listaEmpleados2) {
            System.out.println(e.getNombre() + " " + e.getApellido() + " " + e.getLegajo() + " " + e.getSueldo());
        }

    }
}
