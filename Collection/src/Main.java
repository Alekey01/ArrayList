import oop.collections.list.arraylist.ArrayList;
import oop.collections.list.arraylist.ArrayListIterator;

public class Main {
    public static void main(String[] args){

        ArrayList datos = new ArrayList();

        datos.addAtFront("Juan");
        datos.addAtTail("Alex");
        datos.addAtFront("Pedro");
        datos.addAtTail("Paco");
        datos.addAtFront("Miguel");
        datos.addAtTail("Carolina");

        datos.removeAllWithValue("Juan");

        //datos.removeAll();

        ArrayListIterator iterator = datos.getIterator();

        while(iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
