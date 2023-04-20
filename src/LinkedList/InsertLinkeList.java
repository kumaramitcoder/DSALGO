package LinkedList;

public class InsertLinkeList {

    Node head;

    private int size;

    InsertLinkeList(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        public Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    // add first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    // add-last

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
           head=newNode;
           return;
        }
        Node currNode = head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    // print

    public void printList(){
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty ");
            return;
        }
        size--;
        head=head.next;
    }

    // delete last

    public void deleteLast(){
        if (head==null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        System.out.println("Linked List");

        InsertLinkeList insertLinkeList = new InsertLinkeList();

        insertLinkeList.addFirst("a");
        insertLinkeList.addFirst("is");

        insertLinkeList.printList();

        insertLinkeList.addLast("Amit");

        insertLinkeList.printList();


        insertLinkeList.addFirst("Wissen");

        insertLinkeList.printList();
        System.out.println(insertLinkeList.getSize());
        insertLinkeList.deleteFirst();

        insertLinkeList.printList();

        insertLinkeList.deleteLast();
//        insertLinkeList.printList();

        System.out.println(insertLinkeList.getSize());

        insertLinkeList.addFirst("this");
        System.out.println(insertLinkeList.getSize());

    }

}
