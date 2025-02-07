public class Guess {
    public static void main(String args[])
    throws java.io.IOException {
         char ch, answer = 'K';
         System.out.println("I'm thinking of a letter between A to Z. ");
         System.out.println("Can you guess the letter? ");
         ch = (char) System.in.read();
         if(ch == answer ) System.out.println("* Right **");
         else
         System.out.println("NO! but you are close.");
    }
}
