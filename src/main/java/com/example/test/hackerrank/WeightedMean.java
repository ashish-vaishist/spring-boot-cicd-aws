package com.example.test.hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class WeightedMean {


    public static void weightedMean(List<Integer> X, List<Integer> W) {

        int sum= W.stream().reduce((n,m)->n+m).get();
      // System.out.println("sum: "+sum);

        AtomicInteger i= new AtomicInteger();
        AtomicInteger temp= new AtomicInteger();
        X.stream().forEach(n->{
         temp.addAndGet(n.intValue() * W.get(i.get()));
            i.getAndIncrement();

        });

        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println(f.format((double)temp.get()/sum));

    }




    public static void MeanMidMode(){

        Scanner sc= new Scanner(System.in);
        int n= 6;

        String []s= {"1","2","3","4","5","5"};



        DecimalFormat f = new DecimalFormat("##.0");

        List<Integer>list= new ArrayList<Integer>();
        int smallest=Integer.MAX_VALUE;

        IntStream.range(0,n).forEach(l->{
            list.add(sc.nextInt());
        });

        int  sum= list.stream().parallel().unordered().reduce((l,m)->l+m).get();


        System.out.println("Mean: "+ f.format((double)sum/s.length));

        for (String a:s){

            int t= Integer.parseInt(a);
            sum=sum+ Integer.parseInt(a);
            if(smallest>Integer.parseInt(a))
                smallest=Integer.parseInt(a);

            list.add(Integer.parseInt(a));

        }

        System.out.println("Mean: "+ f.format((double)sum/s.length));

        Collections.sort(list);
        double  median=0.0;
        if(n%2==0){


            median= (list.get(n/2)+ list.get((n/2)-1))/2.0;
        }
        else
            median= list.get((n/2)+1);


        System.out.println("Median: "+ f.format(median));


        AtomicInteger mode= new AtomicInteger();
        AtomicInteger maxFreq= new AtomicInteger(1);
        list.stream().parallel().forEach(x->{
            int temp= Collections.frequency(list, x);

            if(maxFreq.get()< temp){
                maxFreq.set(temp);
                mode.set(x);
            }

        });


        int md= maxFreq.get()==1? list.get(0):mode.get();
        System.out.println("Mode: "+ md);
    }

    public static void stdDev(List<Integer> arr) {
        DecimalFormat f = new DecimalFormat("##.0");
        double mean= arr.stream().reduce((n,m)->n+m).get();
        mean= Double.parseDouble(f.format((double) mean/arr.size()));

        double finalMean = mean;
        AtomicReference<Double> dd= new AtomicReference<>(0.0);

        arr.stream().forEach(n->{

           int d= (int) (n- finalMean);

           dd.updateAndGet(v -> v + d * d);

        });

         System.out.println(f.format(Math.sqrt(dd.get()/arr.size())));

    }

    public static  void  main(String[] args){

      //  weightedMean(Arrays.asList(1,2,3),Arrays.asList(5,6,7));

       // MeanMidMode();


        List<Integer> list= new ArrayList();
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(4);

        stdDev(list);



    }



}
