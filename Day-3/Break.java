import java.util.Scanner;
class Break
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();
for(int i=1;i<=20;i++)
{
if(i==n)
{
break;
}
System.out.println(i);
}
}
}