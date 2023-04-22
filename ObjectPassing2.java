//Passing object through a function
//Sum of left & right diagonal and store it in left diagonal

import java.util.*;

class ObjectPassing2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Matrix : ");
        int n=sc.nextInt();
        
        Matrix obj1=new Matrix(n);
        Matrix obj2=new Matrix(n);
        
        obj1.getmatrix();
        System.out.print("Original Matrix.....\n");
        obj1.display();
        obj2.sumdiagonal(obj1);
        System.out.print("Final Matrix.....\n");
        obj2.display();
    }
}
class Matrix
{
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[100][100],i,j,m;
    Matrix(int mm)
    {
        m=mm;
        int a[][]=new int[m][m];
    }
    void getmatrix()
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    void sumdiagonal(Matrix A)
    {
        for(i=0;i<A.m;i++)
        {
            for(j=0;j<A.m;j++)
            {
                if(i==j)
                    this.a[i][j]=A.a[i][i]+A.a[i][m-1-i];
                else
                    this.a[i][j]=A.a[i][j];
            }
        }
    }
}