import java.util.*;
import java.lang.*;

public class garbageexp {

    public static void main(String args[]) {
        garbageexp ob1 = new garbageexp();
        garbageexp ob2 = new garbageexp();
        garbageexp ob3 = new garbageexp();
        ob1 = ob2;
        ob3 = null;
        System.gc();
    }

    public void finalize() {
        System.out.println("Garbage collected....");
    }
}