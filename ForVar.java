public class ForVar {
         public static void main(String args[]) {
            int sum = 0;
            int fact = 1;
            for (int i = 1; i <= 100; i++) {
                sum += i;
                fact *= i;
            }
            System.out.println("Sum is: " + sum);
            System.out.println("The factorial is: " + fact);
         }
}
