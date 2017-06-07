/**
 * Created by Sean on 6/4/17.
 */
public class FixedCapacityStackOfStringGeneric<Item> {
    private Item[] ar;
    private int N;

    public FixedCapacityStackOfStringGeneric(int cap) {

        // Note !!!!
        this.ar = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {return N == 0;}

    private boolean isFull() {return N == this.ar.length;}

    public void push(Item item) throws Exception {
        if (this.isFull()) {
            throw new Exception("Stack is full");
        }

        ar[N++] = item;
    }

    public Item pop() throws Exception {
        if (this.isEmpty())
            throw new Exception("Stack is empty, cant pop, in Generic");

        return ar[--N];
    }

}
