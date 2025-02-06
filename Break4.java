public class Break4 {
    public static void main(String args[])
    {
        int i;
        for(i = 1; i < 4; i++)
        {
            one: {
                two: {
                    three: {
                        System.out.println("\ni is " + i );
                        
                    }
                    System.out.println("after block three.");

                }
                System.out.println("after block two.");
            }
            System.out.println("after block one.");
        }
        System.out.println("After for.");
    }
}
