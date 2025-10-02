import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String name = readLine(myScanner, "Enter your full name: ");
        String [] fullName = name.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];

        String date = readLine(myScanner, "Enter the pick up date (MM/dd/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate pickUpDate = LocalDate.parse(date, formatter);

        int ticket = readInt(myScanner, "How many tickets would you like? ");
        if (ticket > 1) {
            System.out.printf("%d tickets", ticket);
        } else {
            System.out.printf("%d ticket", ticket);
        }

        System.out.printf("%d reserved for %s under %s, %s", ticket, pickUpDate, lastName, firstName);

    }
    //region methods
    public static String readLine(Scanner in, String prompt){
        System.out.println(prompt);
        return in.nextLine();

    }

    public static int readInt(Scanner in, String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    //endregion

}
