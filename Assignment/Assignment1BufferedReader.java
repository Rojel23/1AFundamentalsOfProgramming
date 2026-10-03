import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment1BufferedReader {
    public static void main(String[] args){
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        //Input
        try{
            System.out.print("Enter year: ");
            int year = Integer.parseInt(dataln.readLine());

            //Conditions
            if(year % 400 == 0){
                System.out.println(year + " is a leap year.");
            }else if(year % 100 == 0){
                System.out.println(year + " is not a leap year.");
            }else if(year % 4 == 0){
                System.out.println(year + " is a leap year.");
            }else{
                System.out.println(year + " is not a leap year.");
            }

            //Catches the Errors
        }catch(NumberFormatException e){
            System.out.println("Invalid Input! Please enter numbers only.");
        }catch(IOException e){
            System.out.println("A problem ahas occur while reading your input.");
        }
    }
}
