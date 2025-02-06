import javax.swing.*;
public class SwingInput {
    public static void main(String[] args) {
        String temp;
        temp = JOptionPane.showInputDialog(null, "First number");

        int a = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Second number");
         
        int b = Integer.parseInt(temp);

        
        temp = JOptionPane.showInputDialog(null, "Third number");

        int c = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, "The average is: " + (a+b+c)/3 );
    }
}
// Here, JOptionPane.showInputDialog gives us popped up input box, one that used to appear in Windows 7 or XP 