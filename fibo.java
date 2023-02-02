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

   static boolean isArm(int n)
   {
    int temp,digits=0,last=0,sum=0;
    temp=n;
    while(temp>0)
    {
        temp=temp/10;
        digits++;
    }
    temp=n;
    while(temp>0)
    {

        last=temp%10;
        sum+=(Math.pow(last, digits));
        temp=temp/10;
    }
    if(n==sum)
    {
        return true;
    }
    else
    {
        return false;
    }
   }



    public static void main(String args[])
    {
        int count=20;
        System.out.print(n1+" "+n2);
        printFibo(count-2);

        checkPrimeNum(4);

        if(isArm(153)){
            System.out.println("it is a arm no");
        }
    
       System.out.println();
    }

   

}

