import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day;
        System.out.print("Enter day number (1-7): ");
        day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
