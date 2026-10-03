import javax.swing.JOptionPane;
public class Labquiz3 {
    public static void main(String[] args) {

        //Storing the value
        String employee = "";
        double salary = 0;

        //Input
        String Sal = "Salary Calculator";
        JOptionPane.showMessageDialog(null, Sal);
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your Old Salary"));

        //Calculation
        double newSalary = salary + ( .1775 * salary);
        double retroSalary = salary * .1775;


        //Output
        String msg = "Your new salary pay is; " + newSalary + "\n" + "Amount of retroactive pay is; " + retroSalary + "\n" + "Amount of retroactive pay in 2 months is; " + retroSalary * 2;


        JOptionPane.showMessageDialog(null, msg);

    }
}
