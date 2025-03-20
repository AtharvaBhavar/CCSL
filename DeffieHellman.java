// {    TY - IT - T1 - A
//     Name : Atharva Sanjay Bhavar;
//     Roll: 13 ; PRN - UIT22M1015      
//     Aim : Implementation of DES Algorithm in Java;
// }

import java.util.*;
import java.math.BigInteger;

public class DeffieHellman {
    int num;
    public boolean isPrime(int num){
        boolean flag = true;
        if(num<=1)
        {
            flag= false;
        }
        for ( int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=false;
            }
        }
        return flag;
        
    }
    

    void algo(BigInteger p, BigInteger g, BigInteger a, BigInteger b){

        BigInteger YA = g.modPow(a, p);
        BigInteger YB = g.modPow(b, p);
        BigInteger XA = YB.modPow(a, p);
        BigInteger XB = YA.modPow(b, p);
        System.out.println("The secret key of A is : "+XA);
        System.out.println("The secret key of B is : "+XB);

    }


    public static void main ( String args[]){
        Scanner sc =  new Scanner(System.in);
        DeffieHellman obj = new DeffieHellman();

        System.out.println("Enter the prime No:");
        
        int n =  sc.nextInt();
        while(obj.isPrime(n)==false){
            System.out.println(" Please enter a prime number");
            n= sc.nextInt();
            
        }
        BigInteger p = BigInteger.valueOf(n);
        System.out.println("Enter the primitive Root : ");
        BigInteger g= sc.nextBigInteger();
        System.out.println("Enter the private key of A: ");
        BigInteger a = sc.nextBigInteger();
        System.out.println("Enter the private key of B: ");
        BigInteger b = sc.nextBigInteger();
        obj.algo(p,g,a,b);
 }
    
}
