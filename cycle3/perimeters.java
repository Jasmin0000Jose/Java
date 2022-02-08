import java.util.*;
public class perimeters {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        int a = sc.nextInt();
        System.out.println("Enter the length of rectangle :");
        int b = sc.nextInt();
        System.out.println("Enter the breadth of rectangle :");
        int c = sc.nextInt();
        perimeters obj=new perimeters(a);
        perimeters obj1=new perimeters(b,c);
        sc.close();
    }
    perimeters(int a)
    {
        System.out.println("Perimeter of circle is:"+(3.14*2*a));
    }
    perimeters(int n,int m)
    {
        int p=n+m;
        int t=2*p;
        System.out.println("Perimeter  of Rectangle is:"+t);
    }
} 