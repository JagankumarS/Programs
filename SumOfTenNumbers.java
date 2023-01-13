//Write a java program to find sum of 10 numbers

//create a class as SumOfTenNumbers
public class SumOfTenNumbers {
    //write a main method
    public static void main(String[] args) {
        //Declare the int array with arr variable and define array elements of 10 numbers
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        //Declare int datatype with sum variable and define value as 0
        int sum=0;
        //write a for loop fro 0 to arr length
        for (int i = 0; i <arr.length; i++) {
            //Define sum is equal to sum plus arr of i
               sum=sum+arr[i];
           }
        //print the statement of sum of Ten number is plus sum.
        System.out.println("sum of Ten number is "+ sum);
        }
    }
