import java.util.Scanner;

 class Notecounter 
{
    public static void main(String[] args)
 {
        int[] denominations = {1000, 500, 100, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int[] noteCount = new int[denominations.length];
for (int i = 0; i < denominations.length; i++)
 {
            if (amount >= denominations[i]) 
{
                noteCount[i] = amount / denominations[i];  
                amount = amount % denominations[i];  
}
        }

        System.out.println("Total number of notes required:");
        for (int i = 0; i < denominations.length; i++) 
{
            if (noteCount[i] > 0) 
{
                System.out.println(denominations[i] + " Rs: " + noteCount[i] + " note(s)");
            }
        }

       }
}
