public class Student {
    private String name;
    private int marks;


    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks); 
    }

    
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }


    public int getMarks() {
        return marks;
    }

    
    public String getName() {
        return name;
    }

    
    public static void main(String[] args) {
        Student s = new Student("Alice", 95);
        System.out.println(s.getName() + "'s marks: " + s.getMarks()); 

        s.setMarks(105); 
        System.out.println(s.getName() + "'s marks: " + s.getMarks()); 

        s.setMarks(88);
        System.out.println(s.getName() + "'s marks: " + s.getMarks());
    }
}
