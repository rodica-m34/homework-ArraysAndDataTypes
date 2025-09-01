package HomeWork;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //- Read a 3x3 matrix from the keyboard and print it
        //readAndPrint();

        //- Find the sum of all elements in a matrix.
        int[][] matrix = new int[][] {{1, 2, 3}, {0, 1, 5}, {2, 5, 2}};
        //System.out.println(sum(matrix));

        //- Find the sum of the main diagonal and the secondary diagonal of a square matrix.
        //sumMainandSecondaryDiagonal(matrix);

        //- Find the transpose of a matrix.
        //transposeOfAMatrix(matrix);
    }

    public static void readAndPrint ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coloumns: ");

        int n= sc.nextInt();
        System.out.print("Enter the number of lines: ");
        int m= sc.nextInt();
        int [][] matrix = new int[n][m];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int sum (int [][] matrix){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    public static void sumMainandSecondaryDiagonal (int [][] matrix)
    {
        int sum1=0, sum2=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j){
                    sum1+=matrix[i][j];
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            sum2+=matrix[i][matrix.length-1-i];
        }
        System.out.println(sum1+ " "+sum2);
    }

    public static void transposeOfAMatrix (int [][]matrix)
    {
        int [][] tMat = new int [matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                // Assign transposed value
                tMat[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < tMat.length; i++) {
            for (int j = 0; j < tMat[i].length; j++) {
                System.out.print(tMat[i][j]+ " ");
            }
            System.out.println();
        }

        //matrix
        //modif




    }
    public static void clone()
    {

    }


}
