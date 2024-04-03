class swap
{
    public static void main(String[] args){
        // Using 3rd variable
        int a = 10;
        int b = 20;

        System.out.println("Numbers befoer swap"+ " A = " + a + " B = " + b);
        
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swap"+ " A = " + a + " B = " + b);

        // Without 3rd variable

        System.out.println("Numbers befoer swap"+ " A = " + a + " B = " + b);


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Numbers after swap"+ " A = " + a + " B = " + b);

        b = 1 % 10;
        
        System.out.println(b);

    }

}