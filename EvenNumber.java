/**Write a java program to find even number
 * creating a for loop from 0 to 100
 *  Give the condition as variable i is divisible by 2 and the value is equal to
 *  print the i value
 */

//create a class as EvenNumber
public class EvenNumber {
    public static void main(String[] args) {
        //write a for loop from 0 to 100
        for(int i=0; i<100; i++){
            //If the i value is divided by 2 and the answer is equal to zero print the statement
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
