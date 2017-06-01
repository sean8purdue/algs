/**
 * Created by Sean on 6/1/17.
 */

class Time {
    public int hour;
    public int minute;
    public int second;
}
public class ObjectParamTransfer {

    Time time;
    public static void main(String[ ] args) {
        ObjectParamTransfer opt = new ObjectParamTransfer();
        opt.time = new Time();
        opt.time.hour = 12;
        opt.time.minute = 45;
        opt.time.second = 20;
        System.out.println("time      ");
        System.out.println("hour="+opt.time.hour);
        System.out.println("minute="+opt.time.minute);
        System.out.println("second="+opt.time.second);

        //objectMethod opt.objectMethod(opt.time);
        System.out.println("        time      ");
        System.out.println("hour = "+opt.time.hour);
        System.out.println("minute = "+opt.time.minute);
        System.out.println("second = "+opt.time.second);
    }

    void objectMethod(Time t) {
        System.out.println("   t      ");
        System.out.println("hour = "+t.hour);
        System.out.println("minute = "+t.minute);
        System.out.println("second = "+t.second);
        System.out.println("  t time   ==       "+(t==this.time));
        System.out.println("  t time equals "+(t.equals(this.time)));
        System.out.println("   t       ");
        t.hour=8; t.minute=12; t.second=24;
    }
}
