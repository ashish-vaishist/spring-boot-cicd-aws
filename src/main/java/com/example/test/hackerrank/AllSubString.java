package com.example.test.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllSubString {


   static Map<Integer,String> map= new HashMap<>();

    static {
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }




    static void getAllSubStr(String s,String f , int n){


        if(s.length()==n){
            System.out.println(f);
            return;
        }

        getAllSubStr(s,f,n+1);
        getAllSubStr(s,f+s.charAt(n),n+1);

        //Collections.sort();


    }


    static void permutation(String s,String f,int n){


        if(s.length()==n){
            System.out.println(f);
            return;
        }

        permutation(s,f,n+1);

        permutation(s,f+s.charAt(n),n+1);

    }


    public static int countDigits(int n,int i){


        if(n<=0)
            return i;

      return countDigits(n/10,i+1);

    }


    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {

        Map<Integer,Integer> map= new TreeMap<Integer,Integer>();

        for(int i: A1){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }

        int j=0;
        for(int ele:A2){

            if(map.containsKey(ele)) {
                int x = map.get(ele) + j;

                for (; j < x; j++) {
                    A1[j] = ele;

                }

                map.remove(ele);
                //  j=j+x;
            }
        }

        for(Map.Entry<Integer,Integer> m: map.entrySet()){

            int x= map.get(m.getKey())+j;
            for(;j<x;j++){
                A1[j]=m.getKey();
            }

        }





        return A1;

    }



    public static int digitalRoot(int n)
    {


        if(n<=0)
            return 0;

       int rem= (n%10)+ digitalRoot(n/10);

            if(rem>9){
                rem= fun(rem);
            }

       return rem;
    }


    static int fun(int n){

        if(n<=0){
            return 0;
        }

        return  (n%10)+fun(n/10);
    }
    public static void main(String[] args) {

       // getAllSubStr("abc","",0);

       // permutation("abc","",0);

      //  System.out.println(countDigits(100,0));

/*
        int[]arr= sortA1ByA2(new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8},11,new int[]{99, 22, 444, 56},4);
        System.out.println(Arrays.toString(arr));*/

        System.out.println(digitalRoot(99999));
    }







}
