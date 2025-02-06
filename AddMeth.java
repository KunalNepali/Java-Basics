public class AddMeth {
    public static void main(String args[])
    {
        Vehiclee minivan = new Vehiclee();
        Vehiclee sportscar = new Vehiclee();

        int range1, range2;

        minivan.passengers = 20;
        minivan.fuelcap = 21;
        minivan.mpg = 17;
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");

        minivan.range();
        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");

        sportscar.range();
    }
}
