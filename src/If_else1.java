import java.util.Scanner;

public class If_else1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age of a person");
        int age=s.nextInt();
        if(age>=18)
        {
            System.out.println("You can vote");
        }
        else{
            System.out.println("Teenager");
        }
    }
    
}
