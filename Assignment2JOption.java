import javax.swing.JOptionPane;

public class Assignment2JOption {
    public static void main(String[] args){

        String pay = JOptionPane.showInputDialog("Enter your hourly pay rate: ");
        double payRate = Double.parseDouble(pay);
        String hour = JOptionPane.showInputDialog("Enter your hours worked: ");
        double hoursWorked = Double.parseDouble(hour);

        double gross = hoursWorked * payRate;

        double taxPercent;
        if (gross < 2000){
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

        String result = String.format("Gross Pay: Php %.2f%nWithholding Tax %.0f%%: Php %.2f%nNet Pay: Php %.2f%n", gross, taxPercent, tax, netPay);

        JOptionPane.showMessageDialog(null, result);
    }
}
