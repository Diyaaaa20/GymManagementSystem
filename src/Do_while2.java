import java.util.Scanner;

public class Do_while2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        System.out.println("You entered "+num);
        int i=num+1;
        int count=0;
        do{
            if(i%2==0){

            System.out.println(i);
            count++;
        }
        i++;
        }
        while(count<5);
    }
    
}
