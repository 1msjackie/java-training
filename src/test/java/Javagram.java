import java.util.Scanner;
public class Javagram {
    public static void main(String[] args) {
        System.out.println("\nWelcome to JavaGram!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("\nWhat is your last name?: ");
        String lastName = scanner.nextLine();
        System.out.println("\nWhat is  age?");
        int  age = scanner.nextInt();
        // add trap line when going from String to int
        System.out.println("\nMake a username: ");
        scanner.nextLine();
        String username = scanner.nextLine();
        System.out.println("\nWhat city do you live in?: ");
        String city = scanner.nextLine();
        System.out.println("\nWhat country is that?");
        String country = scanner.nextLine();



        System.out.println("Thank you for join JavaGram!!!");
        System.out.println("\nHere is the info you enter:");
        System.out.println("\tFirst Name: " + firstName);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age );
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

    }
}
