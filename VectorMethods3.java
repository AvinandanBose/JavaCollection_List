import java.util.Vector;
public class VectorMethods3 {

    public static void main(String[] args){
        // capacity()
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        Integer i = vector.capacity();
        System.out.println(i);

    }
    
}
