import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment2BufferedReader {
    public static void main(String[] args){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{
            //Inputs the data needed.
            System.out.print("Enter your hourly pay rate: ");
            double payRate = Double.parseDouble(input.readLine());
            System.out.print("Enter your hours worked: ");
            double hoursWorked = Double.parseDouble(input.readLine());

            //Computation for Gross Pay
            double grossPay = hoursWorked * payRate;

            //Computation for withholding tax
            double taxPercent;
            if(grossPay <= 2000){
                taxPercent = 10;
            }else if(grossPay > 2000 && grossPay <= 4000){
                taxPercent = 12;
            }else if(grossPay > 4000 && grossPay <= 10000){
                taxPercent = 15;
            }else{
                taxPercent = 20;
            }
            double tax = grossPay * (taxPercent / 100);

            //Computation for Net Pay
            double netPay = grossPay - tax;

            //Prints gross pay, withholding tax, and net pay.
            System.out.printf("Gross pay is: Php %.2f%n", grossPay);
            System.out.printf("Withholding Tax %.0f%%: Php %.02f%n", taxPercent, tax);
            System.out.printf("Net Pay is: %.2f%n", netPay);


        }catch(NumberFormatException e){
            System.out.println("Error! Please input numbers only");
        }catch(IOException e){
            System.out.println("A problem has occur while reading your input.");
        }
    }
}
