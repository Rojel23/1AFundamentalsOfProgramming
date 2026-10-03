import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class labquiz {
    public static void main(String[] args){
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Enter your Birth Year: ");
            String birthInput = dataln.readLine();
            int birth = Integer.parseInt(birthInput);
            System.out.println("You were born last " + birth + ".");
            int year = 2026 - birth;
            System.out.println("You are now " + year + "yrs old.");

        }catch(IOException e){
        System.err.println("Error reading input stream.");

        }catch(NumberFormatException e){
        System.err.println("Invalid number format! Please enter digits only.");

    }
}}

