//write a java program to find given character is vowel or not
import java.util.Scanner;
//create a class as Vowel
public class Vowel {
    //write a main method
    public static <or> void main(String[] args){
        //Declare a int datatype with i variable and define value as 0
            int i=0;
            //write a scanner class
            Scanner sc = new Scanner(System.in);
            //write a print statement as Enter the character
            System.out.println("Enter the character");
            //create a character object
            char ch = sc.next().charAt(0);
            //check the if condition
           if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               //print the statement
            System.out.println("The given character "+ch+ " is a vowel");
           }
           //check the else if condition
           else if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')){
               //print the statement
            System.out.println("The given character "+ch+ " is a consonant");
        }
    }
}