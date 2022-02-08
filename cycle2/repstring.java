import java.util.*;//Replace a particular character in a string

class repstring {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = obj.next();// accepting string
        char a[] = s.toCharArray();
        System.out.println("Enter position of character to be replaced:");
        int x = obj.nextInt();// position of character
        System.out.println("Enter character to be placed:");
        char c = obj.next().charAt(0);// accepting character
        int i = 0, n;
        n = s.length();
        for (i = 0; i < n; i++) {
            if (x == (i + 1)) {
                a[i] = c;
                break;
            } else {
                continue;
            }
        }
        System.out.println("New string is:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\n");
    }
}