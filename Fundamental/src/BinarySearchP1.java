/**
 * Created by Sean on 6/2/17.
 */
import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class BinarySearchP1 {

//    public static int search (int key, int[] ar) {
    // test private method;
    // private static also works
    private static int search (int key, int[] ar) {
        int lo = 0;
        int hi = ar.length;
        int mid;

        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;

            if (key < ar[mid]) hi = mid - 1;

            else if (key > ar[mid]) lo = mid + 1;

            else return mid;

        }

        return -1;
    }

    public static void main(String[] args) {
        // test for local array
//        int [] whiteList = In.readInts();
        int [] whiteList = {2, 6, 1, 9, 10, 3, 2, 25, 30};
        Arrays.sort(whiteList);

        for (int i = 0; i < whiteList.length; i++)
            System.out.println(whiteList[i]);

        int key = 6;
        if(search(key, whiteList) < 0) {
            System.out.format("%d not found", key);
        } else {
            System.out.println("key is found");
        }

        key = 7;
        if(search(key, whiteList) < 0) {
            System.out.format("%d not found", key);
        } else {
            System.out.println("key is found");
        }

    }

}
