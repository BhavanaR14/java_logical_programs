class Integer
{
public static void main(String args[])
 {
int count = 0;
int num = 12545657;
System.out.println("given number:: " + num);
while(num != 0)
{
num = num / 10;
count++;
}
System.out.println("Number of digits in the given integer are:: " + count);
}
}