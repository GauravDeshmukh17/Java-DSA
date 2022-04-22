
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

package com. company ;

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

}


