
// CALCULATION OF FACTORIAL

/*package com.company;

import java.util.*;

public class FunctionRevision {

    public static int factorial(int x){

        int fact=1;
        for(int i=x;i>=1;i--){

            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int r=scn.nextInt();

        int nf=factorial(n);
        int nmrf=factorial(n-r);
        int rf=factorial(r);

        int ans=nf/(nmrf*rf);
        System.out.println(ans);
    }

}*/

//-------------------------------------------------------------------------------------------------

// DIGIT FREQUENCY

/*package com. company ;

import java.util.Scanner;

public class FunctionRevision{

    public static int digitCount(int n,int d){

        int count=0;
        while(n!=0){

            int remainder=n%10;
            if(remainder==d){

                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n=number in which 'd' is to be searched
        int d=scn.nextInt();  // d=digit to be counted

        int ans=digitCount(n,d);
        System.out.println(ans);
    }

}*/

//-------------------------------------------------------------------------------------------------

// DECIMAL TO BINARY

/*package com.company;

import java.util.*;

public class FunctionRevision{

    public static int binaryToDecimal(int n){

        int sum=0;
        int power=1;

        while(n!=0){

            int remainder=n%2;
            sum=sum+(remainder*power);
            power=power*10;
            n=n/2;
        }
        return sum;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int dtb=binaryToDecimal(n);
        System.out.println(dtb);

    }

}*/

//-------------------------------------------------------------------------------------------------

// DECIMAL TO ANY BASE

/*package com.company;

import java.util.Scanner;

public class FunctionRevision{

    public static int decimalToAnyBase(int n,int b){

        int ans=0;
        int power=1;

        while(n!=0){

            int remainder=n%b;
            ans=ans+(remainder*power);
            power=power*10;
            n=n/b;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n=number
        int b=scn.nextInt();  // b=base

        int dtab=decimalToAnyBase(n,b);
        System.out.println(dtab);
    }

}*/

//-------------------------------------------------------------------------------------------------

// BINARY TO DECIMAL

/*package com.company;

import java.util.Scanner;

public class FunctionRevision{

    public static int binaryToDecimal(int n){

        int ans=0;
        int power=1;

        while(n!=0){

            int remainder=n%10;
            ans=ans+(remainder*power);
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

//-------------------------------------------------------------------------------------------------

package com.company;

import java.util.*;

public class FunctionRevision{

    public static int anyBaseToDecimal(int n,int b){

        int ans=0;
        int power=1;

        while(n!=0){

            int remainder=n%10;
            ans=ans+(remainder*power);
            power=power*b;
            n=n/10;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int b=scn.nextInt();

        int abtd=anyBaseToDecimal(n,b);
        System.out.println(abtd);
    }

}



