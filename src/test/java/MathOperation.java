public class MathOperation {
    public static void main(String[] args) {

        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L; //250 billion
        long starsInAndromeda = 1_000_000_000_000L; // 1 trillion
        double testScore = 6.7;
// always add parentheses around math operations
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + starsInMilkyWay + starsInAndromeda + " stars in the Milky Way and Andromeda galaxies.");

        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + "more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way");

        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * 1.25) + " 10");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / 2.0));

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));
// % is useful to determine if number is even or odd
        int counter = 0;
        // ++ adds 1 and -- subtracts 1
        counter++;
        counter++;
        counter++;
        System.out.println(counter);
        counter--;
        counter--;
        counter--;
        System.out.println(counter);

        int passengers = 0;
        passengers += 9;
        System.out.println(passengers);
        passengers -=5;
        System.out.println(passengers);
        passengers -= 4;
        System.out.println(passengers);
        // += (add by) increase the value by number on the right
        // -= ( subtract by ) decrease the value by number on the right




    }
}