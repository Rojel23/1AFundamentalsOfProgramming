import java.util.Scanner;

public class Assignment3Scanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your NSAT score: ");
        double nsat = input.nextDouble();
        System.out.print("Enter your parents' monthly salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter your entrance exam score: ");
        double exam = input.nextDouble();

        double average = (nsat + exam) / 2;

        if(salary > 10000 || nsat < 90 || exam < 85){
            System.out.println("You are REJECTED from the college scholarship.");
        }else if(salary <= 3500 && average >= 91){
            System.out.println("You are ACCEPTED from the college scholarship.");
        }else{
            System.out.println("Your application is under further study.");
        }

    }
}
