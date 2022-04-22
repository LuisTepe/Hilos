/*

    Autor: Alejandro Sandoval
 */

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Threads implements Runnable {

    public static final String TAG = Threads.class.getSimpleName();
    public static final Logger LOGGER = Logger.getLogger(TAG);
    public static Map<Integer, Integer> factMap = new HashMap<Integer, Integer>();

    public Threads() {
    }

    private int i;
    private int aux;
    int primNum;

    public void run() {
        i = 0;

        while (true) {

            primNum = Lista.getLista();
            aux = factorial(primNum);

            String name = Thread.currentThread().getName();
            //System.out.println("Current thread: " + name + " ~ " + Lista.getLista());

            System.out.println("Num dado: " + primNum + ". Factorial: " + aux + " ~ From thread: " + name);

            if (i >= Lista.size()-1) {
                break;
            }
            i++;
/*
            try {
                //descansar medio segundo
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                LOGGER.severe(ex.getMessage());
            }
*/
        }
    }

    public static int factorial(int numero) {
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }

}

