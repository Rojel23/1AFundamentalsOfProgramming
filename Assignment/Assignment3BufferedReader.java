import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment3BufferedReader {
    public static void main(String[] args){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Enter your NSAT score: ");
            double nsat = Double.parseDouble(input.readLine());
            System.out.print("Enter your parents' monthly salary: ");
            double salary = Double.parseDouble(input.readLine());
            System.out.print("Enter your entrance exam score: ");
            double exam = Double.parseDouble(input.readLine());

            double ave = (nsat + exam) / 2;

            if(salary > 10000 || nsat < 90 || exam < 85){
                System.out.println("You are REJECTED from the college scholarship.");
            }else if(salary <= 3500 && ave >= 91){
                System.out.println("You are ACCEPTED from the college scholarship");
            }else{
                System.out.println("Your application is under further study.");
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid! Enter numbers only.");
        }catch (IOException e){
            System.out.println("A problem has occurred.");
        }

    }
}
