package com.example.test.hackerrank;

import java.util.ArrayList;

public class MathProb {



    // find nth natural no. which does not contains 9
    static long findNth(long n)
    {

        long k=n;
        for(long i=1;i<=k;i++){

            if(String.valueOf(i).contains("9")){
                k=k+1;
                continue;
            }

        }


        return k;

    }


    static  void getPrimeFactor(int n){

        int t=n;
        for (int i=2;i<=Math.sqrt(t);i++){

            if(n%i==0){

                while (n%i==0){
                    System.out.println(i);
                    n/=i;
                }

            }

        }

        if (n>1)
            System.out.println(n);
    }


    //efficient approch of prime no.
    static boolean isPrime(int n){

        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;

        for (int i= 5; i*i<=n;i=i+6){
            if(n%i==0  || n%(i+2)==0){
                return false;
            }
        }

        return  true;
    }

//  first devide no by 5 then multiple 5 i.e. 25,125
//  and sum of the no is trauling zeros.
    static int trailingZeroes(int n){

        int res=0;

        for(int i=5;i<=n;i=i*5){

            res+=n/i;
        }

        return res;
    }

    // leaders in Array no ele greater in right of an array   with recursion
    static void leadersinArray(int arr[], int n) {

       System.out.println( lead(arr,n,arr[n-1],new ArrayList<>()));

    }


    static  ArrayList<Integer> lead(int [] arr,int size,int max,ArrayList<Integer>list){


        if(size<=0)
            return  list;

        if(arr[size-1]>=max){

            max=arr[size-1];

            lead(arr,size-1,max,list);
            list.add(max);

        }else{
            lead(arr,size-1,max,list);
        }



        return list;
    }



    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(2);
        l.add(5);

    //    System.out.println(findNth(9l));

   //     getPrimeFactor(275);

   //     System.out.println(isPrime(275));


        int  arr[] = {16,17,4,3,5,2};  // O/P  17,5,2
        leadersinArray(arr,arr.length);


    }
}
