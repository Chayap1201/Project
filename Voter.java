public class Voter {
    private int age;

    
    public Voter(int age) {
        if (age > 0) this.age = age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    
    public boolean isEligible() {
        return age >= 18;
    }

    
    public int getAge() {
        return age;
    }

    
    public static void main(String[] args) {
        Voter v = new Voter(20);
        System.out.println(v.getAge() + " Eligible? " + v.isEligible()); 

        v.setAge(15);
        System.out.println(v.getAge() + " Eligible? " + v.isEligible()); 
    }
}


