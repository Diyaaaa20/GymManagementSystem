import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        switch(num)
        {
            case 1:
                System.out.println("Good Morning");
                break;
                case 2:
                    System.out.println("Good Afternoon");
                    break;
                    case 3:
                        System.out.println("Good Evining");
                        break;
                        default:
                            System.out.println("Invalid number");

        }

    }
    
}
