public class ContToLabel {
    public static void main(String args[])
    {
        outerloop:
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("\nOuter loop pass " + i + ", Inner loop: ");
            for (int j = 1; j <= 10; j++)
            {
                if(j == 10 ) continue outerloop;
                System.out.println(j);
                
            }
        }
    }
}
