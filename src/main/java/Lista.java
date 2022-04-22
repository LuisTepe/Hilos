import java.util.HashMap;
import java.util.Map;

public class Lista {

    public static Map<Integer, Integer> list = new HashMap<Integer, Integer>();;
    static int i = 0;
    static int j = 0;
    static int index;

    public Lista() {

    }

    public static void setLista(int num) {
        list.put(i, num);
        System.out.println(list.get(i));
        i += 1;
    }

    public static int getLista() {
        try {
            index = list.get(j);
            j += 1;
        } catch (IndexOutOfBoundsException ioobe){

        }
        return index;
    }

    public static int size(){
        return list.size();
    }

}
