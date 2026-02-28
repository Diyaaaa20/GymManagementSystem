import java.util.Scanner;

public class For_loop3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        int nextnum=num%2==0?num+2:num+1;
        for(int i=0;i<5;i++)
        {
            System.out.println(nextnum);
            nextnum+=2;
        }
        
    }
    
}
