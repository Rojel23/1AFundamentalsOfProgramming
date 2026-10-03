import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4BufferedReader {
    public static void main(String[] args){

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("(R - Recommendee or N - Non-Recommendee)" + "\n" + "Enter you recommendee code: ");
            char code = input.readLine().charAt(0);
            //Responsible for proper input.
            if(code != 'R' && code != 'N'){
                System.out.println("Please input proper recommendee code.");
                return; //Stops and return from the top.
            }

            System.out.print("Enter you height in centimeters: ");
            double height = Double.parseDouble(input.readLine());
            System.out.print("Enter you age: ");
            int age = Integer.parseInt(input.readLine());
            System.out.print("(C - Citizen of Endor or N - Non-Citizen)" + "\n" + "Enter your citizen code: ");
            char citizen = input.readLine().charAt(0);
            //Responsible for proper input
            if(citizen != 'C' && citizen != 'N'){
                System.out.println("Please input proper citizen code.");
                return;
            }

            //conditional
            if(code == 'R'){
                System.out.println("You are automatically ACCEPTED!");
            }else if(height >= 200 && age >= 21 && age <= 25 && citizen == 'C'){
                System.out.println("You are ACCEPTED!");
            }else{
                System.out.print("You are REJECTED!");
            }

        }catch (NumberFormatException e){
            System.out.println("Invalid! Please enter proper input.");
        }catch (IOException e){
            System.out.println("An error has occurred.");
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Please enter a proper code.");
        }
    }
}
