abstract class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    
    }
    
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " +age);
    }
    abstract void role();
    
}
interface Payable {
    void payFee();
}

interface Trainable {
    void workout();
}
interface DietPlanner {
    void giveDietPlan();
}

class Member extends Person implements Payable, Trainable {
    double monthlyFee = 1000;

    Member(String name, int age) {
        super(name, age);
    }

    void role() {
        System.out.println("I am a Gym Member");
    }

   public void payFee() {
    System.out.println("Membership Fee paid: Rs. " + monthlyFee);
   }
    
    public void workout() {
        System.out.println("Doing workout");
    }
}    

class Trainer extends Person implements Trainable, DietPlanner {

    Trainer(String name, int age) {
        super(name, age);
    }

    void role() {
        System.out.println("I am a Trainer");
    }

   public void workout() {
    System.out.println("Training Clients.");
   }
    
    public void giveDietPlan() {
        System.out.println("Providing Diet Plan.");
    }
}    

public class GymTest {
    public static void main(String[] args) {
        
        Person p1 = new Member("Diya", 22);
        Person p2 = new Trainer("Rahul", 32);

        System.out.println("---- Member Details -----");
        p1.showDetails();
        p1.role();

        System.out.println("\n---- Trainer Details----");
        p2.showDetails();
        p2.role();

        System.out.println("\n---- Member Actions----");
        Payable pay = new Member("Diya", 22);
        pay.payFee();

        Trainable workoutMember = new Member("Diya", 22);
        workoutMember.workout();

        System.out.println("\n---- Trainer Actions----");
        Trainable workoutTrainer = new Trainer("Rahul", 32);
        workoutTrainer.workout();

        DietPlanner diet = new Trainer("Rahul", 32);
        diet.giveDietPlan();
    }
    }