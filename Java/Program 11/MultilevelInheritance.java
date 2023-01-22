class Person {
    String name = "John Doe";
    int age = 30;
}
class Employee extends Person {
    int empId = 1;
    float basicSalary = 15000;
}
class Manager extends Employee {
    String department = "Clerk";
    float salaryBonus = 4000;
}
class MultilevelInheritance {
    public static void main(String[] args) {
        Manager mn = new Manager();
        System.out.println("Id :" + mn.empId);
        System.out.println("Name :" + mn.name);
        System.out.println("Age :" + mn.age);
        System.out.println("Department :" + mn.department);
        System.out.println("Basic Salary :" + mn.basicSalary);
        System.out.println("Salary Bonus :" + mn.salaryBonus);
    }
}