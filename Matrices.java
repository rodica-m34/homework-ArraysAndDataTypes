package HomeWork;

import java.util.Arrays;
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

        //- Multiply every element of a matrix by a given constant.
        //multiplyElementsOfAMatrix(matrix, 2);

        //- Add two matrices of the same size.
        int[][] matrix2 = new int[][] {{1, 2, 3}, {0, 1, 5}, {2, 7, 2}};
        //addTwoMatrices(matrix, matrix2);

        //- Multiply two matrices (basic algorithm).
        //multiplyTwoMatrices(matrix, matrix2);

        //- Check if a matrix is symmetric (equals its transpose).
        /*int[][] matrix3 = new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        isSymmetric(matrix3);*/

        //- Find the maximum element in a matrix and its position (row, column).
        //findMaxElement(matrix2);

        //- Rotate a square matrix 90 degrees clockwise.
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

    public static int [][] transposeOfAMatrix (int [][]matrix)
    {
        int [][] tMat = new int [matrix.length][matrix[0].length];
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
        return tMat;
    }

    public static void multiplyElementsOfAMatrix (int [][]matrix, int elem)
    {
        int [][] mMat = new int [matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mMat[i][j] = matrix[i][j]*elem;
            }
        }
        for (int i = 0; i < mMat.length; i++) {
            for (int j = 0; j < mMat[i].length; j++) {
                System.out.print(mMat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void addTwoMatrices (int [][]matrix1, int [][]matrxi2)
    {
        int [][] newmat = new int [matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                newmat[i][j] = matrix1[i][j]+matrxi2[i][j];
            }
        }
        for (int i = 0; i < newmat.length; i++) {
            for (int j = 0; j <newmat[i].length; j++) {
                System.out.print(newmat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void multiplyTwoMatrices (int[][] matrix1, int[][]matrix2)
    {
        int [][] mMat = new int [matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                mMat[i][j] = matrix1[i][j]*matrix2[i][j];
            }
        }
        for (int i = 0; i < mMat.length; i++) {
            for (int j = 0; j <mMat[i].length; j++) {
                System.out.print(mMat[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void isSymmetric (int[][]matrix)
    {
        boolean isSymmetric=true;
        int [][]tMat = transposeOfAMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]!=tMat[i][j]){
                    isSymmetric=false;
                }
            }
        }
        if (isSymmetric)
        {
            System.out.println("is symmetric");
        }
        else {
            System.out.println("not symmetric");
        }
    }

    public static void findMaxElement (int [][]matrix)
    {
        int max = matrix[0][0];
        int row=0, col=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]>max){
                    max=matrix[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println("Max element is: " +max + " and its position is on row "+row+" and column "+col);
    }

}
