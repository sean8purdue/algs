/**
 * Created by Sean on 6/2/17.
 */
import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class BinarySearchP1 {

//    public static int search (int key, int[] ar) {


    // test private method;
    // private static also works
//    private static int search (int key, int[] ar) {

    // test2 public non static method used in the same class

    public int search (int key, int[] ar) {

        int lo = 0;
        int hi = ar.length - 1;
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
////        int [] whiteList = In.readInts();
//        int [] whiteList = {2, 6, 1, 9, 10, 3, 2, 25, 30};
//        Arrays.sort(whiteList);
//
//        for (int i = 0; i < whiteList.length; i++)
//            System.out.println(whiteList[i]);
//
        // test2 public non-static method used in same class
        BinarySearchP1 bsP1 = new BinarySearchP1();
//
//        int key = 6;
//        if(bsP1.search(key, whiteList) < 0) {
//            System.out.format("%d not found", key);
//        } else {
//            System.out.println("key is found");
//        }
//
//        key = 7;
//        if(bsP1.search(key, whiteList) < 0) {
//            System.out.format("%d not found", key);
//        } else {
//            System.out.println("key is found");
//        }

        int [] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (bsP1.search(key, whiteList) < 0 )
                StdOut.println(key);
        }

    }

}
