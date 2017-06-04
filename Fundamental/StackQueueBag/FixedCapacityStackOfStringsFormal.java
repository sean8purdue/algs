/**
 * Created by Sean on 6/4/17.
 */
public class FixedCapacityStackOfStringsFormal {
    private String[] ar;
    private int size = 0;  // Next available index in the array

    public FixedCapacityStackOfStringsFormal(int cap) {
        this.ar = new String[cap];
    }

    public boolean isEmpty() { return  size == 0; }

    private boolean isFull() {return size == ar.length;}

    public void push(String str) throws Exception {

        if (this.isFull()) {
            throw new Exception("Stack is Full, can't push");
        }

        ar[size++] = str;
    }

    public String pop() throws Exception {

        if (this.isEmpty()) {
            throw new Exception("Stack is Empty, can't pop");
        }

        return ar[--size];
    }

    public static void main(String[] args) {
        try {
            FixedCapacityStackOfStringsFormal s = new FixedCapacityStackOfStringsFormal(5);
            s.push("one");
            s.push("two");
            s.push("three");
            System.out.println(s.pop());
            System.out.println(s.pop());
            s.push("four");
            System.out.println(s.pop());
            System.out.println(s.pop());
//            s.pop();  // <-- this causes an underflow exception
            //     when uncommented

            if (s.isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Stack is not empty");
            }

            if (s.isFull()) {
                System.out.println("Stack is full");
            } else {
                System.out.println("Stack is not full");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }


}
