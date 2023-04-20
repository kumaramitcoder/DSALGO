package LinkedList;

import java.util.LinkedList;

public class InsertLinkListCollection {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("a");
        linkedList.addFirst("is");
        linkedList.addFirst("hello world");

        System.out.println(linkedList);

        linkedList.addLast("this ");
        linkedList.addLast("is amit");

        System.out.println(linkedList);

        System.out.println(linkedList.size());

        for (int i =0; i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println("null");

        linkedList.removeFirst();

        System.out.println(linkedList);

        linkedList.removeLast();

        System.out.println(linkedList);

        System.out.println(2);
    }
}
