import java.util.LinkedList;
public class LinkedListMethods23 {

    public static void main(String[] args) {

        // toString()
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        String s = list.toString();
        System.out.println(s);

    }
    
}
