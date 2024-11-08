import java.util.*;
class Product1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int Pno;
String Pname;
float Pcost;
float Pqty;
 System.out.println("Enter Product Number: ");
 Pno=sc.nextInt();
 System.out.println("Enter Product Name: ");
Pname=sc.next();
 System.out.println("Enter Product Cost: ");
Pcost=sc.nextFloat();
System.out.println("Enter Product Quantity: ");
Pqty=sc.nextFloat();
float bill=Pcost*Pqty;
System.out.println("the bill is:"+bill);
System.out.println("The Product Number is:"+Pno);
System.out.println("The Product Name is:"+Pname);
System.out.println("The Product Cost is:"+Pcost);
System.out.println("The Product Quantity is:"+Pqty);
}
}