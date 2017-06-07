import java.util.Iterator;

/**
 * Created by Sean on 6/6/17.
 */
public class FixedCapacityStackGenericP1<Item> implements Iterable<Item> {
    private Item[] ar;
    private int N = 0;

    public FixedCapacityStackGenericP1(int cap) {
        ar = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {return N == 0;}

    private boolean isFull() {return N == ar.length;}

    public int size() {return N;}

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = ar[i];
        ar = temp;
    }

    public void push(Item item) {
        if (N == ar.length) resize(2*ar.length);
        ar[N++] = item;
    }

    public Item pop() {
        Item item =  ar[--N];
        ar[N] = null; // avoid loitering ???

        if (N > 0 && N == ar.length/4) resize(ar.length/2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;
        public boolean hasNext() { return i > 0; }
        public Item next() { return ar[--i]; }
        public void remove() { }

    }

}
