/**
 * Created by Sean on 6/1/17.
 */

import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class BinarySearchSean {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < a[mid]) hi = mid - 1;

            if (key > a[mid]) lo = mid + 1;

            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
//        int [] whiteList = In.readInts();
        int [] whiteList = {2, 6, 1, 9, 10, 3, 2,  25, 30};
        Arrays.sort(whiteList);

        for (int i = 0; i < whiteList.length; i++)
            System.out.println(whiteList[i]);

        int key = 6;
        if(rank(key, whiteList) < 0) {
            System.out.format("%d not found", key);
        } else {
            System.out.println("key is found");
        }

        key = 7;
        if(rank(key, whiteList) < 0) {
            System.out.format("%d not found", key);
        } else {
            System.out.println("key is found");
        }


    }
}
