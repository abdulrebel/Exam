class fibo{
    static int n1=0,n2=1,n3=0;
    static void printFibo(int count)
    {
        if(count>0)
            {n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(" "+n3);
                printFibo(count-1);
            }
        
    }

    static void checkPrimeNum(int i)
    {
        if(i%2==0||i%3==0||i%5==0||i%7==0||i%13==0)
        {
            System.out.println("It is a prime number");
        }
        else 
        {
            System.out.println("it is not a prime num");
        }

    }

    public static void main(String args[])
    {
        int count=20;
        System.out.print(n1+" "+n2);
        printFibo(count-2);

    }

}

