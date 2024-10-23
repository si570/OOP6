import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        String input = "";
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Please enter a number between 1 and 9:");
                input = myscan.nextLine();
                int Mynum = Integer.parseInt(input);

                if (Mynum >= 1 && Mynum <= 9) {
                    System.out.println("The number is " + Mynum);
                   validInput = true;
                } else {
                    System.out.println("The number is out of range. Please enter a number between 1 and 9.");
                }
            } catch (NumberFormatException ae) {
                System.out.println("Not a valid number: " + ae.getMessage());
            }
        }

        myscan.close(); // Close the scanner after valid input is received
    }
}


