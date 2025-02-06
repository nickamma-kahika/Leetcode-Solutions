import java.util.LinkedList;

public class ImplementingLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
