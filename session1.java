class Student {
    String name;
    int age;
    int marks;
 Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
  void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}
public class session1 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 18, 85);
        Student s2 = new Student("Bob", 19, 92);
        s1.displayDetails();
        s2.displayDetails();
    }
}
