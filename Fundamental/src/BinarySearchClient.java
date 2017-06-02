import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by Sean on 6/2/17.
 */
public class BinarySearchClient {

    public static void main(String[] args) {

        // test for local array
//        int [] whiteList = In.readInts();
//        int [] whiteList = {2, 6, 1, 9, 10, 3, 2,  25, 30};
//        Arrays.sort(whiteList);
//
//        for (int i = 0; i < whiteList.length; i++)
//            System.out.println(whiteList[i]);

//        int key = 6;
//        if(rank(key, whiteList) < 0) {
//            System.out.format("%d not found", key);
//        } else {
//            System.out.println("key is found");
//        }
//
//        key = 7;
//        if(rank(key, whiteList) < 0) {
//            System.out.format("%d not found", key);
//        } else {
//            System.out.println("key is found");
//        }

        // test for files
//        int [] whiteList = In.readInts(args[0]);
//        Arrays.sort(whiteList);
//
//        while (!StdIn.isEmpty()) {
//            int key = StdIn.readInt();
//            if (BinarySearchSean.rank(key, whiteList) < 0 )
//                StdOut.println(key);
//        }
//
//        System.out.println("test");


        // test2 public non-static method used in same class

//        int [] whiteList = In.readInts();
        int [] whiteListL = {2, 6, 1, 9, 10, 3, 2,  25, 30};
        Arrays.sort(whiteListL);
        BinarySearchP1 bsT = new BinarySearchP1();

        int key = 6;

        if(bsT.search(key, whiteListL) < 0) {
            System.out.format("%d not found", key);
        } else {
            System.out.println("key is found");
        }

        key = 7;
        if(bsT.search(key, whiteListL) < 0) {
            System.out.format("%d not found\n", key);
        } else {
            System.out.println("key is found");
        }

//         test for files
        int [] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);

//        for (int i = 0; i < whiteList.length; i++)
//            System.out.println(whiteList[i]);

        while (!StdIn.isEmpty()) {
            int keyF = StdIn.readInt();
            if (bsT.search(keyF, whiteList) < 0 )
                StdOut.println(keyF);
        }


    }
}
