import java.util.*;

class sp {
  public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter string:");
    String s = obj.next();
    String t = s;
    int i, n;
    n = s.length();
    for (i = 0; i < n; i++) {
      if (s.charAt(i) == t.charAt(n - i - 1)) {
        continue;
      } else {
        System.out.println("Not Palindrome");
        break;
      }
    }
    if (i == n)
      System.out.println("Palindrome");
  }
}
