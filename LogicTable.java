class LogicTable {
    public static void main(String args[]) {
        boolean x, y;

        // Header for the truth table
        System.out.println("X\tY\tAND\tOR\tXOR\tNOT X\tNOT Y");

        // First case: x = true, y = true
        x = true; y = true;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((x & y) + "\t");
        System.out.print((x | y) + "\t");
        System.out.print((x ^ y) + "\t");
        System.out.print(!x + "\t" + !y);
        System.out.println();

        // Second case: x = true, y = false
        x = true; y = false;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((x & y) + "\t");
        System.out.print((x | y) + "\t");
        System.out.print((x ^ y) + "\t");
        System.out.print(!x + "\t" + !y);
        System.out.println();

        // Third case: x = false, y = true
        x = false; y = true;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((x & y) + "\t");
        System.out.print((x | y) + "\t");
        System.out.print((x ^ y) + "\t");
        System.out.print(!x + "\t" + !y);
        System.out.println();

        // Fourth case: x = false, y = false
        x = false; y = false;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((x & y) + "\t");
        System.out.print((x | y) + "\t");
        System.out.print((x ^ y) + "\t");
        System.out.print(!x + "\t" + !y);
        System.out.println();
    }
}
