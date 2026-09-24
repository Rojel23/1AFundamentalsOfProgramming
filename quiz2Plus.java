import javax.swing.JOptionPane;
public class quiz2Plus {
    public static void main(String[] args){
        String chef = "";
        double kg = 0;
        double Vinegar = 0;

        String into = "Welcome to Adobo Cooking Show";
        JOptionPane.showMessageDialog(null, into);
        chef = JOptionPane.showInputDialog("Please enter your name");
        kg = Integer.parseInt(JOptionPane.showInputDialog("How many kilo of pork will you cook?"));

        double result1 = 0.5 * kg;
        double result2 = 0.33 * kg;
        String msg = "The ratio of soy sauce for " + kg + "kg is = " + result1 + "\n" + "The ratio of vinegar for " + kg + "kg is = " + result2;
        JOptionPane.showMessageDialog(null, msg);

        
    }
}