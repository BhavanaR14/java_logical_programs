import java.util.Scanner;

 class Alphabet1
{
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0); 
                if (Character.isUpperCase(input)) 
{
            System.out.println(input + " is an uppercase alphabet.");
        } 
else if (Character.isLowerCase(input))
 {
            System.out.println(input + " is a lowercase alphabet.");
        } 
else
 {
            System.out.println(input + " is not an alphabet.");
        }

    }
}
