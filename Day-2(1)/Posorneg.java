import java.util.Scanner;

public class Posorneg {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
           int n;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        if (n>0)
 {
      System.out.println("The number is positive.");
        }
 else
 {
            System.out.println("The number is negative.");
     }
}
