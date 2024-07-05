import java.util.Scanner;

/*

1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4


 */


public class MatrixPatternOne {
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter number of rows");
        int n=in.nextInt();
        int count=0;
        int j;
        for(int i=1;i<=n;i++)
        {
            j=i;
            while(count!=n)
            {
                System.out.print(j+" ");
                j++;
                if(j==n+1)
                    j=1;
                count++;
            }
            count=0;
            System.out.println();
        }
    }
}

