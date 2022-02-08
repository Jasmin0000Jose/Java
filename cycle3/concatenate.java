import java.util.*;

class concatenate {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        concatenate obj = new concatenate();
        System.out.println("Enter numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        obj.add(a, b);
        System.out.println("Enter strings:");
        String c = in.next();
        String d = in.next();
        obj.add(c, d);
    }

    void add(int x, int y) {
        System.out.println("After addition - " + (x + y));
    }

    void add(String s1, String s2) {
        System.out.println("After addition - " + s1 + s2);
    }
}
