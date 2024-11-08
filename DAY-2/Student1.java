import java.util.*;
class Student1
{
public static void main(String args[])
{
int stdno;
String stdname;
int maths;
int phy;
int che;
int total;
float avg;
Scanner sc=new Scanner(System.in);
 System.out.println("Enter Student Number: ");
 stdno=sc.nextInt();
 System.out.println("Enter Student Name: ");
stdname=sc.next();
 System.out.println("Enter Maths marks: ");
maths=sc.nextInt();
System.out.println("Enter Physics marks: ");
phy=sc.nextInt();
System.out.println("Enter Chemistry marks: ");
che=sc.nextInt();
System.out.println("Enter Total marks: ");
total=maths+phy+che;
 avg=total/3;
System.out.println("The Student Number is:"+stdno);
System.out.println("The Student Name is:"+stdname);
System.out.println("The Maths marks is:"+maths);
System.out.println("The Physics marks is:"+phy);
System.out.println("The Chemistry marks is:"+che);
System.out.println("The Total Marks is:"+total);
System.out.println("The Average Marks is:"+avg);
}
}