import java.util.Scanner;

public class Transpose
{
    public static void main(String[] args)
    {
        int row, con, i, j;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        row = s.nextInt();

        System.out.println("Enter the number of columns");
        con = s.nextInt();

        int m[][] = new int[row][con];

        System.out.println("Enter the elements of the matrix");

        for (i = 0; i < row; i++)
        {
            for (j = 0; j < con; j++)
            {
                m[i][j] = s.nextInt();
            }
        }

        System.out.println("Transpose of the matrix is:");
        System.out.println("______________________________");

        for (i = 0; i < con; i++)
        {
            for (j = 0; j < row; j++)
            {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
    }
}                                                                               