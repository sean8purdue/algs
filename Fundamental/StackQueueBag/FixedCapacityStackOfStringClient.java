/**
 * Created by Sean on 6/4/17.
 */
public class FixedCapacityStackOfStringClient {

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

            // test private method in class
//            if (s.isFull()) {
//                System.out.println("Stack is full");
//            } else {
//                System.out.println("Stack is not full");
//            }

        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
