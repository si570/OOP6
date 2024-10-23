import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {



        try {
            System.out.println("Please enter in a number between 0 and 9");
            Scanner myscan = new Scanner(System.in);
        }

            String input = myscan.nextLine();
        }
            int Mynum = Integer.parseInt(input);

        if(Mynum >=0 && Mynum <= 9) {
            System.out.println("The number is " + Mynum);
        }
        catch(NumberFormatException ae){
            System.out.println("Not a valid number" + ae.getmessage());
        }


    }
}
