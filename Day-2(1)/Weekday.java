import java.util.Scanner;
 class Weekday
 {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the week number (1-7): ");
        int weekNumber = sc.nextInt();
        String day;
        switch (weekNumber) 
{
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid week number! Please enter a number between 1 and 7.";
        }

        System.out.println(day);
    }
}
