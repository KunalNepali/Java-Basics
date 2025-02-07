import java.util.Scanner;

public class KeyboardInpu {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        System.out.println("Enter a second number:");
        int b = scanner.nextInt();
        System.out.println("Enter a third number:");
        int c = scanner.nextInt();   
        
        System.out.println("The average is " + (a + b + c) / 3);
        
        scanner.close();
    }    
}
