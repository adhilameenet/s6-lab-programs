import java.util.Scanner;
class Employee {
    String name = "John Doe";
    int age = 20;
    float basicPay;
}
class Programmer extends Employee {
    String department = "Manager";
    float bonus;
    void totalSalary() {
        float total = super.basicPay + bonus;
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Department :" + department);
        System.out.println("Basic Pay :" + basicPay);
        System.out.println("Bonus :" + bonus);
        System.out.println("Total Salary : " + total);
    }
}

class EmployeeInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bp,bon;
        System.out.print("Enter the basic salary :");
        bp = sc.nextFloat();
        System.out.print("Enter the Bonus :");
        bon = sc.nextFloat();
        Programmer pro = new Programmer();
        pro.basicPay = bp;
        pro.bonus = bon;
        pro.totalSalary();
    }
}