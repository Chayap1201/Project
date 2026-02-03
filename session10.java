class College {
    
    String collegeName;
    String location;

    College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    void displayDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
        System.out.println("----------------------");
    }
}

public class session10 {
    public static void main(String[] args) {
        
        College c1 = new College("Harvard University", "Cambridge, MA");
        College c2 = new College("Stanford University", "Stanford, CA");
        College c3 = new College("MIT", "Cambridge, MA");

    
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}
