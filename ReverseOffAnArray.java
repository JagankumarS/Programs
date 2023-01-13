//write a java program to fine reverse of an array

import java.util.Arrays;
//Create a class as ReverseOfAnArray
public class ReverseOffAnArray {
    //write a main method
    public static void main(String[] args) {
        //Declare a variable arr with int array datatype and define array elements of 10 numbers
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        //Declare the tempNum variable with int array datatype and define new int arr length
        int[] tempNum = new int[arr.length];
        //Declare int datatype with pos variable and define value as 0.
        int pos=0;
        //write a for loop from 0 to arr length
        for (int i=0; i <arr.length ; i++) {
            //print the statement as arr of i
            System.out.println(arr[i]);
        }
        //write a for loop from arr length minus 1 to i grater than or equal to 0
        for (int i = arr.length-1; i >=0; i--) {
            //Define temNum array of pos equal to arr array of i
            tempNum[pos]=arr[i];
            //update the positon
            pos++;
        }
        //print the statement as Reverse of array is "+ Arrays.toString(tempNum)
        //import the java.util
        System.out.println("Reverse of array is "+ Arrays.toString(tempNum));
    }
}
