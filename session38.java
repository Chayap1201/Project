
class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach() {
        System.out.println(name + " is teaching");
    }
}


class MathTeacher extends Teacher {
    MathTeacher(String name) {
        super(name);
    }

    void solveEquation() {
        System.out.println(name + " is solving a math equation");
    }
}


class ScienceTeacher extends Teacher {
    ScienceTeacher(String name) {
        super(name);
    }

    void conductExperiment() {
        System.out.println(name + " is conducting a science experiment");
    }
}


public class session38 {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher("Alice");
        ScienceTeacher st = new ScienceTeacher("Bob");

        mt.teach();            
        mt.solveEquation();    

        System.out.println();

        st.teach();             
        st.conductExperiment(); 
    }
}
