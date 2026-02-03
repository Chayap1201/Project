class Animal1 {
    void eat() {
        System.out.println("Animal1 is eating");
    }
}

class Dog extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}


public class Animal {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   
        p.bark(); 
        p.weep(); 
    }
}
