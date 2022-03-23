import java.util.*;
class matrix
{
 public static void main(String[]args)
{
 int i,j,a[][]=new int[2][3];
Scanner s1=new Scanner(System.in);
System.out.println("enter numbers");
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=s1.nextInt();
}
}
System.out.println("display no.");
for(i=0;i<2;i++)
{
for(j=0;j<3;j++)
{
System.out.print("\t"+a[i][j]+" ");
}
System.out.println("");
}


}
}