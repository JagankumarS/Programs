/**Write a java program to find average,maximum and minimum number
 * This program is used to find average, maximum and minimum number in the given numbers
 * Declare the variable and define the array of 10 elements
 * check the given  condition
 * print the statement
 */


//create a class MaxMinAndAvg
public class MaxMinAndAvg {
    //write a main method
    public static void main(String[] args) {
        //Declare a int array datatype with arr variable and define array elements
        int[] arr = {12, 13, 14, 151, 16, 23, 34, 53, 45, 65};
        //Declare int datatype with n variable and define arr length
        int n = arr.length;
        //Declare in datatype with sum,max,min,avg separately and define 0 as element.
        int sum = 0;
        int max = 0;
        int min = 0;
        int avg = 0;

        //write for loop of i from 0 to n
        for (int i = 0; i < n; i++) {
            //If the arr of i is grater than max then assign max equal to arr of i
            if (arr[i] > max) {
                max = arr[i];
            }
            //If the arr of i is less than min then assign min equal to arr of i
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        //write for loop of j from 0 to arr length then assign sum value as sum plus arr of j
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        //Define avg as sum divided by n
        avg = sum / n;
        //print the statement as The average number of an array is plus avg
        System.out.println("The average number of an array is "+avg);
        //print the statement as The average number of an array is plus max
        System.out.println("The maximum number of an array is "+max);
        //print the statement as The average number of an array is plus min
        System.out.println("The minimum number of an array is "+min);
    }
            }