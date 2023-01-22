class Student {
    String[] name = { "Ram","Gokul","Raju","Ammu" };
    int[] rollno = {1, 2, 3, 4};
    int[] mark1 = {70, 50, 98, 12};
    int[] mark2 = {32, 65, 76, 23};
    int [] mark3 = {67, 46, 34, 67};
}
class ArrayObjects {
    public static void main(String args[]) {
    Student s = new Student();
    for(int i = 0; i < 4; i++) {
        System.out.println("Name : "+ s.name[i]);
        System.out.println("Roll No : "+ s.rollno[i]);
        System.out.println("Mark1 : "+ s.mark1[i]);
        System.out.println("Mark2 : "+ s.mark2[i]);
        System.out.println("Mark3 : "+ s.mark3[i]);
        int avg = (s.mark1[i] + s.mark2[i] + s.mark3[i]) / 3;
        System.out.println("Average Mark : " + avg);
        System.out.println("");
    }
  }
}