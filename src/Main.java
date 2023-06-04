import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {

        String userAns;
        int min, max, mid, value;
        min = 1;
        max = 1000;
        mid = 0;

        System.out.println("------------\nChoose number bewteen (" + max + " - " + min + ")\n------------");
        Scanner input = new Scanner(System.in);

        while (min <= max) {
            mid = Math.floorDiv((max+min), 2);
            System.out.print("Your number is: " + ANSI_YELLOW + mid + ANSI_RESET + "\n(yes, lower, higher): ");
            userAns = input.next();

            if (userAns.equals("yes")) {
                break;
            } else if (userAns.equals("higher")) {
                min = mid+1;
            } else if (userAns.equals("lower")) {
                max = mid-1;
            }
        }

        System.out.println("Your Number is " + mid);
    }
}