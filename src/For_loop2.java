import java.util.Scanner;

public class For_loop2 {
    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("Next 5 numbers");
        //int i;
        for(int i=0;i<=5;i++)
        {
            System.out.println(num+i);
        }
        
    }
    
}
