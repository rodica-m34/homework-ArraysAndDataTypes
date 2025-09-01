package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAndDataTypes {
    public static void main(String[] args) {
        //- Declare an array of 10 integers. Read values from the keyboard and print them in reverse order.
        //printReverseOrder ();

        //- Find the maximum and minimum values in an integer array.
        //printMaxAndMin();

        //- Calculate the sum and average of an integer array.
       //SumAndAverage();

        // - Count how many even and odd numbers exist in an integer array.
        //OddAndEvenNumbers();

        //- Copy all elements from one array into another.
        //copyElements();

        //- Reverse an array in place (without using a second array).
        //reverseArray();

        //- Merge two arrays of the same size into one (concatenation).
        //mergeArrays();

        //- Find the second-largest element in an array.
        //secondLargestElement();

        //- Shift all elements of an array to the left by 1 position (the first element becomes the last).
        //shiftElements();

    }
    public static void  printReverseOrder (){
        System.out.println("Problem 1: ");
        int [] arr = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+ " ");
        }




    }

    public static void  printMaxAndMin (){
        System.out.println("Problem 2: ");
        int [] arr = new int [10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min=0, max=0;
        for (int i = 0; i< arr.length ; i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
            else
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Min = "+min +" Max= " + max );
    }

    public static void SumAndAverage ()
    {
        System.out.println("Problem 3: ");
        System.out.println("Type the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0, average=0, count=0;
        for (int i = 0; i< arr.length ; i++)
        {
            sum+=arr[i];
        }
        average=sum/n;
        System.out.println("Sum= "+sum+" average= "+average);
    }

    public static void OddAndEvenNumbers ()
    {
        System.out.println("Problem 4: ");
        System.out.println("Type the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sumEvenNumbers=0, sumOddNumbers=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]%2==0) {
                sumEvenNumbers++;
            }
            sumOddNumbers++;
        }
        System.out.println("sumEvenNumbers= "+sumEvenNumbers+" sumOddNumbers= "+sumOddNumbers);
    }

    public static void copyElements (){
        System.out.println("Problem 4: ");
        System.out.println("Type the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int arr2 [] = new int[n];
        arr2 = arr.clone();
        for (int i : arr2) {
            System.out.print(i+ " ");
        }
    }

    public static void reverseArray ()
    {
        System.out.println("Problem 4: ");
        System.out.println("Type the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i< arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int i : arr)
        {
            System.out.print (i+ " ");
        }
    }

    public static void mergeArrays ()
    {
        System.out.println("Problem 5: ");
        System.out.println("Type the size of the  array: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Type in the elements of the first array: ");
        for (int i = 0; i< n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int [] arr2 = new int [n];
        System.out.println("Type in the elements of the second array: ");
        for (int i = 0; i< n ; i++)
        {
            arr2[i] = sc.nextInt();
        }


        int c = n+n;
        int [] arr3 = new int[c];
        for (int i = 0; i < n; i++) {
            arr3[i]=arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr3[n+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void secondLargestElement () {
        System.out.println("Problem 6: ");
        System.out.println("Type the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max=0;
        for (int i : arr) {
            if (i>max){
                max=i;
            }
        }
        int secondMax=0;
        for (int i : arr) {
            if (i>secondMax){
                if (i==max)
                {
                    continue;
                }
                secondMax =i;
            }
        }
        System.out.println("Second largest element: "+secondMax);
    }

    public static void shiftElements () {
        System.out.println("Problem 7: ");
        System.out.println("Type the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Type in the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int elemFinal = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1]=elemFinal;
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }

    public static void modificare()
    {

    }
}
