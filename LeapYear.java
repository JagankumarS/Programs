/**write a java program find a leap year
 * Create a class as LeapYear
 * write main method and declare the variables and define the values
 * write if condition  year is divisible by  400,100,4 and it is equal to 0
 * Assign the variable as true else false
 * print the statement
 */

//create a class as LeapYear
public class LeapYear {
    //write a main method
    public static void main(String[] args) {
        //Declare int datatype and year variable and define 2056 to year.
        int year =2056;
        //Declare boolean datatype and variable as flag and define as false.
        boolean flag=false;
        //Write If the year divided by 400 is equal to 0 then flag equal to true
        if(year%400==0){
            flag=true;
        }
        // else if year divided by 100 is equal to 0 then flag equal to true
        else if(year%100==0){
            flag=true;
        }
        // else if year divided by 4 is equal to 0 then flag equal to true
        else if(year%4==0){
            flag=true;
        }
        //else flag equal to false
        else{
            flag=false;
        }
        //Write if the flag is true print year 2056 is a leap year else print year 2056 is not a leap year
        if(flag){
            System.out.println("Year "+year+" is a leap year");
        }else{
            System.out.println("Year "+year+" is not a leap year");
        }
    }
}
