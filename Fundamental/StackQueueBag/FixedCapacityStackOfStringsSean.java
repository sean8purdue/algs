/**
 * Created by Sean on 6/4/17.
 */
public class FixedCapacityStackOfStringsSean {

    private String[] ar; // <-- holds all of the Strings in the stack
    private int N = 0;   // <-- holds index of next available cell in the items array

    public FixedCapacityStackOfStringsSean(int cap) {
        this.ar = new String[cap];
    }

    public boolean isEmpty() {return N == 0;}

    public int size() {return this.N; }

    public void push(String st) {
        this.ar[N] = st;
        N++;
    }

    public String pop() {
        N--;
        return this.ar[N];
    }

}
