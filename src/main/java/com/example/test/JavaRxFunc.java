package com.example.test;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;

public class JavaRxFunc {

    static int t=0;
    public static <T> void main(String [] args){

        Flowable<String> single= Flowable.just("ssas ","ssasaas");


        single.flatMap((t)->{

            Flowable f= Flowable.just("dsd"+t.toUpperCase());

            return f;

        }).subscribe((t)->{
            System.out.println(t);
        });


        single= single.concatWith(single.just("dsssdds"));

         Disposable d= single.subscribe((s)->{System.out.println(s);});





    }
}
