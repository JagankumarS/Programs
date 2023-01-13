/**write a java program to insert an element in array
 * Create a class as InsertMethod
 * Create a main method and declare array datatype with the variable & define the values
 * write a for loop from 0 to array length & define the i value to the variable
 * print the statement
 */

import java.util.Arrays;

public class InsertElement {
    //write a main method
    public static void main(String[] args) {
        //Declare arr variable with int array datatype and define array elements
        int[] arr = {1, 2, 3, 4, 5};
        //Declare int  datatype with n variable and define arr.length to n
        int n=arr.length;
        //Declare int array datatype with variable newArr and define new int array of n plus 1
        int[] newArr=new int[n+1];
        //write a for loop from 0 till arr length
        for (int i = 0; i < arr.length; i++) {
            //Assign arr of i value to newArr of i
                newArr[i] = arr[i];
            }
        //print the statement of newArr
        System.out.println(Arrays.toString(newArr));
        }
    }

