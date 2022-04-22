import java.util.HashMap;
import java.util.Map;

public class Lista {

    public static Map<Integer, Integer> lista = new HashMap<Integer, Integer>();;
    static int i = 0;
    static int j = 0;
    static int indicej;

    public Lista() {

    }

    public static void setLista(int num) {
        lista.put(i, num);
        System.out.println(lista.get(i));
        i += 1;
    }

    public static int getLista() {
        try {
            indicej = lista.get(j);
            j += 1;
        } catch (IndexOutOfBoundsException ioobe){

        }
        return indicej;
    }

    public static int size(){
        return lista.size();
    }

}
