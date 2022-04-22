
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

/*package com.company;

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

}*/

//---------------------------------------------------------------------------------------

// ANY BASE TO ANY BASE CONVERSION

/*package com.company;

import java.util.Scanner;

public class Main{

    // gb=given base  ,  cb=conversion base
    public static int anyBaseToAnyBase(int n,int gb,int cb){

        int ans=0;
        int power=1;


        while(n!=0){

            int remainder=n%cb;
            ans+=(power*remainder);
            power*=gb;
            n=n/cb;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int gb=scn.nextInt();
        int cb=scn.nextInt();

        int toDecimal=anyBaseToAnyBase(n,gb,10);
        int toAnyBase=anyBaseToAnyBase(toDecimal,10,cb);
        System.out.println(toAnyBase);
    }

}*/

//----------------------------------------------------------------------------------------

// ANY BASE ADDITION

/*package com.company;

import java.util.Scanner;

public class Main{

    public static int anyBaseAddition(int n1,int n2,int b){

        int power=1;
        int carry=0;
        int ans=0;

        while(n1!=0 || n2!=0 || carry!=0){

            int r1=n1%10;
            int r2=n2%10;

            int sum=r1+r2+carry;
            int temp=sum%b;
            ans+=temp*power;
            power*=10;
            carry=sum/b;
            n1=n1/10;
            n2=n2/10;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();

        int val= anyBaseAddition(n1,n2,b);
        System.out.println(val);

    }

}*/

//--------------------------------------------------------------------------------------

/*package com.company;

import java.util.Scanner;

public class Main{

    // n2>n1
    public static int anyBaseSubtraction(int n1,int n2,int b){

        int power=1;
        int ans=0;
        int carry=0;

        while(n1!=0 || n2!=0 || carry!=0){

            int r2=n2%10;
            int r1=n1%10;

            int sub=r2-r1-carry;
            carry=0;

            if(sub<0){

                int temp=sub+b;
                ans+=temp*power;
                carry++;
            }
            else{

                ans+=sub*power;
            }

            power*=10;
            n2/=10;
            n1/=10;

        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();

        // given i.e  n2>n1
        int abs=anyBaseSubtraction(n1,n2,b);
        System.out.println(abs);
    }

}*/

//-------------------------------------------------------------------------------------

// ANY BASE MUTIPLICATION

/*package com.company;

import java.util.*;

public class Main{

    public static int anyBaseMultiplication(int n1,int n2,int b){

        int power=1;
        int carry=0;
        int ans=0;

        while(n1!=0 || carry!=0){

            int r1=n1%10;
            int product=(r1*n2)+carry;
            int temp=product%b;
            carry=product/b;
            ans=ans+(temp*power);
            power*=10;
            n1=n1/10;
        }
        return ans;
    }

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();

        int abm=anyBaseMultiplication(n1,n2,b);
        System.out.println(abm);
    }
}*/

//---------------------------------------------------------------------------

// ANY BASE MULTIPLICATION

/*package com.company;

import java.util.*;

public class Main{

    public static int anyBaseMultiplication(int n1,int d,int b){

        int power=1;
        int carry=0;
        int ans=0;

        while(n1!=0 || carry!=0){

            int r1=n1%10;
            int product=(r1*d)+carry;
            int temp=product%b;
            carry=product/b;
            ans=ans+(temp*power);
            power*=10;
            n1=n1/10;
        }
        return ans;
    }

    public static int anyBaseAddition(int n1,int n2,int b){

        int power=1;
        int carry=0;
        int ans=0;

         while(n1!=0 || n2!=0 || carry!=0){

             int r1=n1%10;
             int r2=n2%10;

             int sum=r1+r2+carry;
             int temp=sum%b;
             ans+=temp*power;
             power*=10;
             carry=sum/b;
             n1/=10;
             n2/=10;

         }
         return ans;
    }

    public static int getFinalAnswer(int n1,int n2,int b){

        int ans=0;
        int power=1;
        while(n2!=0){

            int d=n2%10;
            int result=anyBaseMultiplication(n1,d,b);
            ans=anyBaseAddition(ans,result*power,b);
            power*=10;
            n2/=10;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int b=scn.nextInt();

        int abm=getFinalAnswer(n1,n2,b);
        System.out.println(abm);
    }

}*/

//----------------------------------------------------------------------------------------------



