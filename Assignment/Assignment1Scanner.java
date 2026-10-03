import java.util.Scanner;

public class Assignment1Scanner {
    public static void main(String[] args){

        Scanner leapyear = new Scanner(System.in);

        //Input
        System.out.print("Enter year: ");
        int year = leapyear.nextInt();

        //Computation
        if( (year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
