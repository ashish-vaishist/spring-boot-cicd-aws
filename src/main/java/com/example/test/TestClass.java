package com.example.test;

import io.reactivex.Flowable;
import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    public  static void main(String[] args){

        Flowable.just("Hello World","Ashish").subscribe(TestClass::print);


        List<List<String>> list = Arrays.asList(
                Arrays.asList("a","c"),
                Arrays.asList("b"));


        List l= new ArrayList();
        int i=0;

        Observable observable= Observable.fromIterable(list).flatMap(s->{

            List ll= (List) s;
            return Observable.fromIterable(ll);
        });


       /* Observable observable1=  observable.flatMap(s->{

            List ll= (List) s;
            return Observable.fromIterable(ll);
        });*/

        observable.subscribe(n->{
            l.add(n);

           System.out.println(n);
        });


        System.out.println(l.toString());

    }


    public static void print(String s){

        System.out.println(s);
    }
}
