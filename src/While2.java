import java.util.Scanner;

public class While2 {
    public static void main(String[] args)
    {
Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=s.nextInt();
    int i=num+1;
    int count=0;

    while(count<5)

    {
        if(i%2==0)
        {
        System.out.println(i);
        count++;
    }i++;
}
}
}