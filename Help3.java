public class Help3 {
    public static void main(String args[]) throws java.io.IOException
    {
           char choice;
           do 
           {
                System.out.println("Help on: ");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while\n");
                System.out.println("6. break");
                System.out.println("7. continue\n");
                System.out.print("Choose one (q to quit): ");

                do
                { 
                   choice = (char) System.in.read();    
                } while (choice == '\n' | choice == '\r');
           }      while( choice < '1' | choice > '7' & choice != 'q');

           System.out.println("\n");

           switch (choice) {
            case '1':
            System.out.println("The if: \n");
            System.out.println("if(condition) statement;");

            System.out.println("else statement");
            break;

           case '2':
           System.out.println("The switch: \n");
           System.out.println("switch(expression) {") ;
           System.out.println("case constant: ");
           System.out.println("statement sequence");
           System.out.println("break;");
           System.out.println("// ...");
           System.out.println("}");     
                break;

            case '3':
            System.out.println("The for: \n");
            System.out.println("for(init; condition; ireration)");
            
            System.out.println("statement;");
            break;

            case '4':
            System.out.println("The while: \n");
            System.out.println("while(condition) statement;");
            break;
            
            case '5':
            System.out.println("The do-while loop");
            System.out.println("do {");
            System.out.println("statement;");
            System.out.println("} while (condition); ");
            break;
            default:
                break;
           }
    }
}
