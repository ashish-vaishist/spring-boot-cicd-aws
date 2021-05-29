package com.example.test.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrWihGivenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {

        int ij=-1;

        ArrayList<Integer> l= new ArrayList<Integer>();
        int k=0;
        int curr= arr[k];
        for(int i=1;i<n;i++){


            if(curr<s){
                curr+= arr[i];
            }

            else if(curr==s) {
                l.add(k+1);
                l.add(i);
                return l;
            }

                while (curr>s && k < i) {
                    curr -= arr[k];
                    if(curr==s) {
                        l.add(k+2);
                        l.add(i);
                        return l;
                    }
                    k++;


                }

          //  k++;
        }


        return l;
    }


    static int majorityElement(int a[], int n)
    {

        if(n==1)
            return a[0];


        Arrays.sort(a);

        for(int i=0;i<n;){
            int  count=1; int t=i;
            for(int j=i+1;j<n;j++){

                if(a[i]==a[j]){
                    count++; t++;
                }
                if(count>n/2) return a[i];
                if(a[i]!=a[j]){
                    t++;
                    break;

                }

            }

            i=t;

        }




        return -1;
    }

    public static void main(String[] args) {


    //    System.out.println( subarraySum(new int[]{1, 4, 20, 3, 10, 5},6,33).toString());  //1,3,6,13,18

        System.out.println(majorityElement(new int[]{3,1,2,2,3,2,2,2,2,2} ,10));


        int j= 125;
        char[] c= (j+"").toCharArray();
        int v = c[0];

    }
}
