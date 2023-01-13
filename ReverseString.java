//write a java program to reverse a string

//create a class as ReverseString
public class ReverseString {
    //Write a main method
    public static void main(String[] args) {
        //Declare a sting datatype with name variable and define jagan as a string
        String name="jagan";
        //Declare a sting datatype with reverse variable and define empty string
        String reverse="";
        //Declare int datatype with length variable and define name.length with empty parameter
        int length=name.length();
        //write a for loop from length minus 1 to i grater than or equal to 0
        for (int i = length-1; i >=0; i--) {
            //Define reverse as reverse plus name.charAt of i
            reverse=reverse+name.charAt(i);
        }
        //print the reverse variable
        System.out.println(reverse);

    }
}
