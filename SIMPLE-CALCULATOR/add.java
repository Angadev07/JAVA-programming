import java.util.*;
class add
{

    public static void main(String args[])
    {
	int a,b,c,ch;
  	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number");
	a=s.nextInt();
	System.out.println("Enter second number");
	b=s.nextInt();
	System.out.println("1.Addition\t 2.Subtraction\t 3.Multiplication\t 4.Division");
	System.out.println("Enter your choice");
	ch=s.nextInt();
	switch(ch)
	{
		case 1: 
		System.out.println("Addition is");
		c=a+b;
		System.out.println("Result is : " +c );
		break;
		
		case 2: 
		System.out.println("Subtraction is");
		c=a-b;
		System.out.println("Result is : " +c );
		break;
		
		case 3: 
		System.out.println("Multiplication is");
		c=a*b;
		System.out.println("Result is : " +c );
		break;

		case 4: 
		System.out.println("Division is");
		c=a/b;
		System.out.println("Result is : " +c );
		break;
		
		default: 
		System.out.println("Wrong choice");
		break;
	}
    }
}