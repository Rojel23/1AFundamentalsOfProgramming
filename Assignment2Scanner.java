import java.util.Scanner;

public class Assignment2Scanner {
    public static void main(String[] args){
        Scanner income = new Scanner(System.in);

        //Input
        System.out.print("Enter your hourly pay rate: ");
        double payRate = income.nextDouble();
        System.out.print("Enter you hours worked: ");
        double hours = income.nextDouble();

        //Computation of all
        double gross = hours * payRate;

        double taxPercent;
        if(gross <= 2000){
            taxPercent = 10;
        }else if(gross > 2000 && gross <= 4000){
            taxPercent = 12;
        }else if(gross > 4000 && gross <= 10000){
            taxPercent = 15;
        }else{
            taxPercent = 20;
        }
        double tax = gross * (taxPercent / 100);

        double netPay = gross - tax;

        //Printing results
        System.out.printf("Gross Pay is: Php %.2f%n", gross);
        System.out.printf("Withholding Tax %.2f%%: Php %.2f%n", taxPercent, tax);
        System.out.printf("Net pay is Php %.2f%n", netPay);
    }
}
