public class Guess4 {
    public static void main(String args[]) throws java.io.IOException{
         char ch, answer = 'K';
         do {
            System.out.println("I have a letter between A and Z.");
            System.out.println("Can you guess it?");

            do {
                ch = (char) System.in.read();
            }
            while ( ch == '\n' | ch  ==  '\r');
            
            if (ch == answer)
            System.out.println("WOAH! You are right!");
            
            else {
                if(ch < answer) System.out.println("A bit low on guess, increase a little.");
                else
                System.out.println("HEY MAN Are you high like your guess? Decrease a little.");
                System.out.println("HMM. Better Luck Next Time DUDE!");
            }
         }
         while(answer != ch);
    }
}
