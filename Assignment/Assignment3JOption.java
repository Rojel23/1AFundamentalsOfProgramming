import javax.swing.JOptionPane;

public class Assignment3JOption {
    public static void main(String[] args){

        String score = JOptionPane.showInputDialog("Enter you NSAT score: ");
        int nsat = Integer.parseInt(score);
        String parents = JOptionPane.showInputDialog("Enter your parents' monthly salary: ");
        int salary = Integer.parseInt(parents);
        String entrance = JOptionPane.showInputDialog("Enter your entrance exam score: ");
        int exam = Integer.parseInt(entrance);

        double average = (nsat + exam) / 2;

        if(salary > 10000 || nsat < 90 || exam < 85){
            JOptionPane.showMessageDialog(null, "You are REJECTED from the college scholarship.");
        }else if(salary <= 3500 && average >= 91){
            JOptionPane.showMessageDialog(null, "You are ACCEPTED from the college scholarship.");
        }else{
            JOptionPane.showMessageDialog(null, "Your application in under further study.");
        }
    }
}
