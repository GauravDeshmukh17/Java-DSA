
/*package com.company;

public class Main{

    public static void main(String args[]){

        int n=7;
        int r=4;

        int nf=1;
        for(int i=1;i<=n;i++){
            nf=nf*i;
        }

        int rf=1;
        for(int i=1;i<=r;i++){
            rf=rf*i;
        }

        int nmrf=1;
        for(int i=1;i<=(n-r);i++){
            nmrf=nmrf*i;
        }

        int ans=nf/(rf*nmrf);
        System.out.println(ans);
    }
}*/

//-----------------------------------------------------------------------------------------

/*package com.company;

public class Main{

    public static int factorial(int x){

        int xf=1;
        for(int i=1;i<=x;i++){

            xf=xf*i;
        }

        return xf;
    }

    public static void main(String args[]){

        int n=5;
        int r=3;

        int ans=factorial(n)/(factorial(r)*factorial(n-r));

        System.out.println(ans);
    }
}*/

//---------------------------------------------------------------------------------------

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        long n=scn.nextLong();  // n=number
        int d=scn.nextInt();   // d=digit to be calculated in n

        int count=0;
        while(n!=0){

            long remainder=n%10;
            if(remainder==d){

                count++;
            }

            n=n/10;
        }
        System.out.println(count);

    }
}*/

//------------------------------------------------------------------------------------

// DECIMAL TO BINARY CONVERSION



















