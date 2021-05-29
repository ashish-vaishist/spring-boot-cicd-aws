package com.example.test;

public class ThreadClass {

    public  static void main(String[] args){

       int arr[]= {1,2,3,4,5,6,7,8,9,10};

       int d=0;
        if(arr.length>=10){
            d= arr.length/(arr.length/3);
        }

        int rem= arr.length%(arr.length/3);

        int k=0; int z=d;
        for (int i=0;i<d;i++){
            int finalK = k;
            int finalZ=z;
            Thread t= new Thread(()->{
                run( arr, finalK, finalZ);
            });
            System.out.println(t.getName());
            t.start();

            k=k+d;
            z=z+d;

        }

        int finalZ1 = z;
        Thread t= new Thread(()->{


            run( arr, arr.length-rem, arr.length);
        });
        t.start();

    }


    public  static void run(int []arr,int s,int l){

        for(int i=s;i<l;i++)
       System.out.println(arr[i]);

    }

}
