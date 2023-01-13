//Write a java program to find prime numbers from 1 to 100

//create the class as PrimeNumbers
public class PrimeNumbers {
    //write the main method
    public static void main(String[] args) {
        //Declare the variable i&n with int datatype and define the value as 0
        int i = 0;
        int num = 0;
        //Declare the variable primeNumbers with string datatype and define empty string
        String primeNumbers = " ";
        //write a for loop from 0 to 100
        for (i = 1; i <= 100; i++) {
            //Declare the count variable with int datatype and define the value as 0.
            int count = 0;
            //write a for loop as num equal to i and num is grater than or equal to 1
            for (num = i; num >= 1; num--) {
                //write if the i modules num is equal to 0
                if (i % num == 0) {
                    //Define count as count plus 1
                    count = count + 1;
            }
        }
            //write if count is equal to 2
            if (count == 2) {
                //Define primeNumbers as primeNumbers plus space plus i
                primeNumbers = primeNumbers + " "+ i ;
            }
        }
        //print the statement as prime numbers from 1 to 100 are :
            System.out.println("prime numbers from 1 to 100 are :");
        //print the primeNumbers
            System.out.println(primeNumbers);
        }
    }
