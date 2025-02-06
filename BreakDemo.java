class BreakDemo {
    public static void main(String[] args) {
        int num;
        num = 625;

        for (int i = 0; i <= num; i++)
        {
            if(i * i >= num)
            break;

            System.out.println(i + " ");
        }
        System.out.println("Loop complete.");
    }
}