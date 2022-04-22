/*

    Autor: Alejandro Sandoval
 */

import java.util.Scanner;

public class Multithreading {

    public static void main(String[] args) {

        System.out.println("Current thread: " + Thread.currentThread().getName());

        //Objetos
        Scanner entrada = new Scanner(System.in);
        Lista list = new Lista();
        Threads r = new Threads();

        //MultiThreads
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        //Cantidad de numeros
        System.out.println("Ingrese la cantidad de numeros: ");
        int cantNum = entrada.nextInt();

        //Llena la lista
        for (int i = 1; i < cantNum+1; i++) {
            System.out.println("Introduzca el num " + i + ": ");
            list.setLista(entrada.nextInt());
        }

        t1.start();
        t2.start();

        System.out.println("Current thread: " + Thread.currentThread().getName());

    }
}
