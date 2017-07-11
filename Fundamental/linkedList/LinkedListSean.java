/**
 * Created by Sean on 6/7/17.
 */
public class LinkedListSean<E> {
    private Node head;
    private Node tail;

    private class Node {
        E item;
        Node next;

        Node(E item) { this.item = item; }
    }

    // add node in the beginning
    public void push(E item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    // remove node in the begining
    public void removeHead() {
        head = head.next;
    }

    // add node in the end
    public void append(E item) {

        // save a link to the last node
        Node oldTail = tail;

        // create a new node for the end
        Node newtail = new Node(item);

        // link the new node to the end of the list
        oldTail.next = newtail;
    }

    // remove node in the end
//    public void removeTail() {     }

    // traversal
    public void traversal() {
        for (Node x = head; x != null; x = x.next) {
            System.out.println(x.item);
        }

    }

    public static void main(String[] args) {

        LinkedListSean<String> list = new LinkedListSean<String>();

        // test push in the head
        list.push("s1");
        list.push("s2");
        list.push("s3");
        list.traversal();

        // test append in the end
//        list.append("t1");
//        list.append("t2");
//        list.append("t3");
//        list.traversal();

    }

}
