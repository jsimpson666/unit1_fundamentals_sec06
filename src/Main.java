import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("THE VIP LOUNGE");

        System.out.print("Hello. Please enter your age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Sorry, but minors are not admitted to the VIP Lounge.");
        }
        else {
            if (age >= 70) {
                System.out.print("Welcome! Please enjoy your evening.");
            } else {
                System.out.print("Do you have a VIP pass? Please enter yes or no: ");
                String vipPassReply = scanner.next();
                if (vipPassReply.equals("yes")) {
                    System.out.print("Welcome! Please enjoy your evening.");
                } else {
                    System.out.println("Sorry, but you must have a VIP pass to enter the Lounge.");
                }

            }
        }
    }
}

