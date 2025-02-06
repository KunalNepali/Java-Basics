public class Guess3 {
    public static void main(String args[])
    throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("I am thinking of a letter between A to Z.");
        System.out.println("Can you guess it?");

        ch = (char) System.in.read();

        if(ch == answer)
        System.out.println("YAYY! RIght");
        else
        System.out.println("NAH! Try again.");

        if(ch < answer) 
        System.out.println("Not that but increase a little.");
        else 
        System.out.println("Hmm. Are you high? Cause your guess is.");
    }
}
