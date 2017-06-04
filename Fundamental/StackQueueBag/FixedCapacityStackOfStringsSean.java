/**
 * Created by Sean on 6/4/17.
 */

import edu.princeton.cs.algs4.*;

public class FixedCapacityStackOfStringsSean {

    private String[] ar; // <-- holds all of the Strings in the stack
    private int N = 0;   // <-- holds index of next available cell in the items array

    public FixedCapacityStackOfStringsSean(int cap) {
        this.ar = new String[cap];
    }

    public boolean isEmpty() {return N == 0;}

    public int size() {return this.N; }

    public void push(String st) {
        if (N < ar.length) {
            this.ar[N] = st;
            N++;
        } else {
            System.out.println("Stack is Full");
            return;
        }
    }

    public String pop() {
        if (N > 0) {
            N--;
            return this.ar[N];
        } else {
            System.out.println("Stack is Empty");
            return null;
        }
    }

    public static void main(String[] args)
    {
        FixedCapacityStackOfStringsSean s;
        s = new FixedCapacityStackOfStringsSean(100);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
                s.push(item);
            else if (!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }

}
