import javax.swing.JOptionPane;
import java.io.IOException;

public class Assignment4JOption {
    public static void main(String[] args){

    try{

        String code = JOptionPane.showInputDialog("(R - Recommendee or N - Non-recommendee)" + "\n" + "Enter you recommendee code: ");
        char recoCode = code.charAt(0);
        if(recoCode != 'R' && recoCode != 'N'){
            JOptionPane.showMessageDialog(null, "Invalid code!");
            return;
        }
        String height = JOptionPane.showInputDialog("Enter you height in cm: ");
        double Height = Double.parseDouble(height);
        String age = JOptionPane.showInputDialog("Enter your age: ");
        double Age = Double.parseDouble(age);

        String citizen = JOptionPane.showInputDialog("(C - Citizen of Endor or N - Non-citizen\nEnter you citizenship code: ");
        char Citizen = citizen.charAt(0);
        if(Citizen != 'C' && Citizen != 'N'){
            JOptionPane.showMessageDialog(null, "Invalid code!");
            return;

        }
        if(recoCode == 'R'){
            JOptionPane.showMessageDialog(null, "You are automatically ACCEPTED!");
        }else if(Height >= 200 && Age >= 21 && Age <= 25 && Citizen == 'C'){
            JOptionPane.showMessageDialog(null, "You are ACCEPTED!");
        }else{
            JOptionPane.showMessageDialog(null, "You are REJECTED.");
        }
    }catch (StringIndexOutOfBoundsException e){
        JOptionPane.showMessageDialog(null, "Please input proper info.");
    }catch (NullPointerException e){
        JOptionPane.showMessageDialog(null, "You cancelled the input.");
    }

    }
}
