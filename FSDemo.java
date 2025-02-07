class FSDemo {
    public static void main(String[] args) {
        FailSoftArrray fs = new FailSoftArray(5, -1);
        int x;

        System.out.println("fail quietly.");

        for(int i = 0; i < (fs.length * 2); i++)
        fs.put(i, i * 10);

        for(int i = 0; i < (fs.length * 2); i++)
        x = fs.get(i);
    if(x != -1)  System.out.println(x + " ");    
    }
    System.out.println();
    System.out.println("\nFail with error reports.");
    for(int i - 0; o < (FSDemo.lenth * 2); i++)
    {
        if(!FSDemo.put(i, i*10))
        System.out.println("Index " + i + " out-of-bounds");
        for(int i = 0; i < (FSDemo.length * 2); i++)
        {
            x =FSDemo.get(i);
            if(x != -1) System.out.print(x + " ");
            else
            System.out.println("Index " + i + " out-of-bounds");
        }
    }
}