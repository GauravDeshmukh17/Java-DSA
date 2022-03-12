
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

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int power=1;
        int binary=0;

        while(n!=0){

            int remainder=n%2;
            binary=binary+(remainder*power);
            n=n/2;
            power=power*10;
        }

        System.out.println(binary);
    }

}*/

//-----------------------------------------------------------------------------------------

// DECIMAL TO ANY BASE USING FUNCTION

/*package com.company;

import java.util.*;

public class Main{

    public static int fun(int n,int b){

        int ans=0;
        int power=1;

        while(n!=0){

            int remainder=n%b;
            ans+=(power*remainder);
            power*=10;
            n/=b;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(); // n=number
        int b=scn.nextInt(); // b=base

        int dn=fun(n,b);
        System.out.println(dn);
    }

}*/

//-------------------------------------------------------------------------------------

// BINARY TO DECIMAL

/*package com.company;

import java.util.*;

public class Main{

    public static int binaryToDecimal(int n){

        int power=1;
        int ans=0;

        while(n!=0){

            int remainder=n%10;
            ans+=(power*remainder);
            power=power*2;
            n=n/10;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int btd=binaryToDecimal(n);
        System.out.println(btd);
    }

}*/

//-------------------------------------------------------------------------------------

// ANY BASE TO DECIMAL

package com.company;

import java.util.*;

public class Main{

    public static int anyBaseToDecimal(int n,int b){

        int ans=0;
        int power=1;

        while(n!=0){

            int remainder=n%10;
            ans+=power*remainder;
            power=power*b;
            n=n/10;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();

        int abtd=anyBaseToDecimal(n,b);
        System.out.println(abtd);
    }

}














