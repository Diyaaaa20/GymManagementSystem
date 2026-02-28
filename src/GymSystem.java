import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

class Member {
    String name;
    String username;
    String password;
    LocalDate membershipEndDate;
    double monthlyFee = 1000;

    Member(String name, String username, String password, LocalDate membershipEndDate) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.membershipEndDate = membershipEndDate;
    }

    void showStatus() {
        LocalDate today = LocalDate.now();
        long daysLeft = ChronoUnit.DAYS.between(today, membershipEndDate);

        if (daysLeft > 5) {
            System.out.println("Membership active. Days remaining: " + daysLeft);
        } 
        else if (daysLeft >= 0) {
            System.out.println("⚠ Membership expiring soon! Days remaining: " + daysLeft);
        } 
        else {
            System.out.println("❌ Membership expired " + Math.abs(daysLeft) + " days ago.");
        }
    }

    void renewMembership(int months) {
        LocalDate today = LocalDate.now();

        if (membershipEndDate.isBefore(today)) {
            membershipEndDate = today.plusMonths(months);
        } else {
            membershipEndDate = membershipEndDate.plusMonths(months);
        }

        System.out.println("✅ Membership renewed till: " + membershipEndDate);
        System.out.println("Amount paid: ₹" + (monthlyFee * months));
    }
}

public class GymSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Member> members = new ArrayList<>();

        // Predefined members
        members.add(new Member("Diya", "diya123", "pass1", LocalDate.now().plusDays(3)));
        members.add(new Member("Rahul", "rahul123", "pass2", LocalDate.now().minusDays(2)));

        System.out.println("===== GYM LOGIN SYSTEM =====");

        System.out.print("Enter username: ");
        String inputUser = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPass = sc.nextLine();

        Member loggedInMember = null;

        for (Member m : members) {
            if (m.username.equals(inputUser) && m.password.equals(inputPass)) {
                loggedInMember = m;
                break;
            }
        }

        if (loggedInMember != null) {

            System.out.println("\nWelcome " + loggedInMember.name + "!");
            loggedInMember.showStatus();

            System.out.println("\nDo you want to renew membership?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter number of months to renew: ");
                int months = sc.nextInt();
                loggedInMember.renewMembership(months);
            } else {
                System.out.println("Thank you. Stay fit 💪");
            }

        } else {
            System.out.println("❌ Invalid username or password.");
        }

        sc.close();
    }
}