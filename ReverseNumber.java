//write the java program to reverse a number

//Create a class as ReverseNumber
public class ReverseNumber {
    //write a main method
    public static void main(String[] args) {
        //Declare the int datatype with number variable and define 7685 as value
        int number=7685;
        //Declare int datatype with reverse variable and define value as 0
        int reverse=0;
        //write while loop as number is not equal to 0
        while(number!=0){
            //Declare int datatype with remainder variable and define number modules 10
            int remainder=number%10;
            //Define reverse as reverse into 10 plus remainder
            reverse=reverse*10+remainder;
            //Declare number equal to number by 10
            number=number/10;
        }
        //print the statement as  The reverse of the given number is: plus reverse
        System.out.println("The reverse of the given number is: "+reverse);
    }
}
