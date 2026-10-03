import java.util.Scanner;

public class Assignment4Scanner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("(R - Recommendee or N - Non-recommendee)" + "\n" + "Enter your recommendee code: ");
        char code = input.next().charAt(0);
        if(code != 'R' && code != 'N'){
            System.out.println("Invalid code!");
            return;
        }
        System.out.print("Enter you height in centimeters: ");
        double height = input.nextDouble();
        System.out.print("Enter your age: ");
        double age = input.nextDouble();

        System.out.print("(C - Citizen of Endor or N - Non-citizen" + "\n" + "Enter you citizenship code: ");
        char citizen = input.next().charAt(0);
        if(citizen != 'C' && citizen != 'N'){
            System.out.println("Invalid code!");
            return;
        }
        //Conditional
        if(code == 'R'){
            System.out.println("You are automatically ACCEPTED!");
        }else if(height >= 200 && age >= 21 && age <= 25 && citizen == 'C'){
            System.out.println("You are ACCEPTED!");
        }else {
            System.out.println("You are REJECTED!");
        }

    }
}
