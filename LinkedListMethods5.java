import java.util.LinkedList;
public class LinkedListMethods5 {
    
        public static void main(String[] args) {
            // getFirst()
            LinkedList<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
    
            System.out.println(list);
    
            Integer i = list.getFirst();
            System.out.println(i);
            System.out.println(list);
    
        }
    
}
