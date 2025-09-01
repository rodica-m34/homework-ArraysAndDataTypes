package HomeWork;

import java.util.Arrays;

public class Functions {
    public static void main(String[] args) {
        //- Write a function that receives an integer array and returns its maximum.
       /* int arr [] = {1, 2, 3, 4,5};
        System.out.println(max (arr));*/

        //- Write a function that receives an integer array and returns its average.
        /*System.out.println(average(arr));*/

        //- Write a function that counts how many times a given number appears in an array.
        /*int [] arr2 = {1, 1, 3, 1, 1,6};
        System.out.println(count(arr2, 1));*/

        //- Write a function that checks if an array is sorted in ascending order.
        /*int [] arr3={2, 3, 4, 5, 6};
        System.out.println(isSorted(arr3));*/

        //- Write a function that merges two arrays and returns a new array with the result.
        /*int arr4[] = { 10, 20, 30 };
        int arr5[] = { 40, 50, 60, 70, 80 };
        String result = Arrays.toString(mergedArray(arr4,arr5));
        System.out.println(result);*/

        //-- Write a function that returns the index of the first occurrence of a given number in an array (or -1 if not found).
        /*int [] arr6 = {1, 3, 4, 2, -1, 2};
        int elem = 2;
        System.out.println("The index is: " + firstOccurence(arr6,elem));*/

        //- Write a function that finds the greatest common divisor (GCD) of two integers.
        //System.out.println(greatestCommonDivisor(18, 27));

        //- Write a function that finds the least common multiple (LCM) of two integers.

        //-- Write a function that receives an array and a number, and returns a new array with all elements greater than that number.
       /* int [] arr7 = {1, 3, 4, 7, 9, 11, -1};
        int elem = 2;
        System.out.println(Arrays.toString(arrayWithGreaterElements(arr7, elem)));*/

        //- Write a function that checks if a number is prime. Use it to print all primes from an array.
        int [] arr8 = {1, 3, 13, 17, 21, 22, 29};
        printPrimeNumbers(arr8);
    }

    private static int max (int [] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private static double average (int []arr)
    {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return (double) sum /arr.length;
    }

    private static int count (int [] arr, int elem){
        int count=0;
        for (int i : arr)
        {
            if (i==elem){
                count++;
            }
        }
        return count;
    }

    public static boolean isSorted (int [] arr){
        int [] arr2 = arr;
        Arrays.sort(arr);
        boolean isSorted;
        System.out.println(Arrays.toString(arr2));
        isSorted = (Arrays.toString(arr).equals(Arrays.toString(arr2)));
        return isSorted;
    }

    public static int [] mergedArray (int [] arr1, int [] arr2)
    {
        int a=arr1.length;
        int b=arr2.length;
        int c = a+b;
        int [] arr3 = new int[c];
        for (int i = 0; i < a; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < b; i++) {
            arr3[a+i]=arr2[i];
        }
        return arr3;
    }

    public static int firstOccurence (int [] arr, int elem){

        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==elem){

                index=i;
                break;
            }
        }
        return index;
    }

    public static int greatestCommonDivisor (int a, int b){
        int greatestCommonDivisor=1;
        for (int i = 1; i <= a/2; i++) {
            if (a%i==0 && b%i==0)
            {
                greatestCommonDivisor=i;
            }
        }
        return greatestCommonDivisor;
    }

    public static int [] arrayWithGreaterElements (int [] arr, int elem)
    {
        int [] newArr= new int [arr.length];
        int j=0;
        for (int i : arr)
        {
            if (i>elem){
                newArr[j++]=i;
            }
        }

        int newLength = newArr.length;
        while (newArr[newLength-1] == 0) {
            --newLength;
        }
        newArr=Arrays.copyOf(newArr,newLength);
        return newArr;
    }

    public static void printPrimeNumbers (int [] arr)
    {
        for (int i : arr) {
            if (isPrime(i))
            {
                System.out.println(i+ " ");
            }
            
        }
    }

    public static boolean isPrime (int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}
