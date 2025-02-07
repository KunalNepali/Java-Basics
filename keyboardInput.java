public class keyboardInput {
               public static void main (String args[])
               {
                System.out.println("Enter a num: ");
                int a = Keyboard.readInt();
                System.out.println("Enter 2nd num: ");
                int b = Keyboard.readInt();
                System.out.println("Enter 3rd num: ");
                int c = Keyboard.readInt();   
                System.out.println("The avg is: " + (a+b+c)/3);
            }    
}
