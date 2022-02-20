import java.util.*;

class employee {
    Scanner obj = new Scanner(System.in);
    String name;
    int age;
    long phn;// phone number
    String ads;// address
    float sly;// salary

    void printSalary() {
        System.out.println("Salary:" + sly);
    }

    void read() {
        System.out.println("Enter name,address,age,phone_number,salary");
        this.name = obj.nextLine();
        this.ads = obj.nextLine();
        this.age = obj.nextInt();
        this.phn = obj.nextLong();
        this.sly = obj.nextFloat();
    }

    void print() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Ph.No.:" + this.phn);
        System.out.println("Address:" + this.ads);
        this.printSalary();
    }
}

class officer extends employee {
    Scanner obj = new Scanner(System.in);
    String spn;// specialization

    void read() {
        super.read();
        System.out.println("Specialization:");
        this.spn = obj.nextLine();
    }

    void print() {
        super.print();
        System.out.println("Specialization:" + this.spn);
    }
}

class manager extends employee {
    Scanner obj = new Scanner(System.in);
    String dep;// department

    void read() {
        super.read();
        System.out.println("Department:");
        this.dep = obj.nextLine();
    }

    void print() {
        super.print();
        System.out.println("Department:" + this.dep);
    }
}

class office {
    public static void main(String args[]) {
        officer o = new officer();
        manager m = new manager();
        o.read();
        System.out.println("####################");
        m.read();
        System.out.println("\n\n");
        o.print();
        System.out.println("####################");
        m.print();
    }

}