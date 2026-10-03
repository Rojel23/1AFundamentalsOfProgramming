import javax.swing.JOptionPane;

public class Assignment1JOption {
    public static void main(String[] args){

        //Shows panel to input the year
        String input = JOptionPane.showInputDialog("Enter year: ");
        //Converts the string to integer.
        int year = Integer.parseInt(input);

        //Computation & Panel Result
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            JOptionPane.showMessageDialog(null, year + " is a leap year");
        }else{
            JOptionPane.showMessageDialog(null, year + " is not a leap year.");
        }

    }
}
