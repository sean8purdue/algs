/**
 * Created by Sean on 6/1/17.
 */

public class ObjectParamTransfer2 {

    Time time1;
    Time time2;
    public static void main(String[ ] args)
    {
        ObjectParamTransfer2 opt = new ObjectParamTransfer2(); //
        opt.time1=new Time();
        opt.time2=new Time();
//
        opt.time1.hour = 12;
        opt.time2.hour = 23;
        System.out.println("        ");
        System.out.println("time1.hour=" + opt.time1.hour);
        System.out.println("time2.hour=" + opt.time2.hour);
//   swap
        opt.swap(opt.time1, opt.time2); System.out.println("        ");
        System.out.println("time1.hour=" + opt.time1.hour);
        System.out.println("time2.hour=" + opt.time2.hour);
    }
    //swap
    void swap(Time t1, Time t2) {
        Time temp;
        temp = t1;
        t1 = t2;
        t2 = temp;
    }

}
