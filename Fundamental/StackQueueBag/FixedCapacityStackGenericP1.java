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

    public void push(Item item) {
        ar[N++] = item;
    }

    public Item pop() {
        return ar[--N];
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
