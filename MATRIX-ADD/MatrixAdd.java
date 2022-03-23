import java.util.*;
public class MatrixAdd
{  
public static void main(String args[])
{  
//creating two matrices    
int i,j,a[][]=new int[2][2],b[][]=new int[2][2],c[][]=new int[2][2];    
Scanner s1=new Scanner(System.in);   
System.out.println("enter elemnts of first matrix");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=s1.nextInt();
}
}

System.out.println("enter elemnts of first matrix");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=s1.nextInt();
}
}
System.out.println("sum of matrix: ");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("sum of matrix: ");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(c[i][j]+" ");

}
System.out.println(" ");
}
}
}

     