package com.example.test.hackerrank;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenericClassAnchorBracket<T,Y extends Supplier<T>> {


    Object t;
    Supplier y;

    GenericClassAnchorBracket(T obj, Y obj1){

        this.t=obj;
        this.y=obj1;

    }

    public Object getT() {
        return t;
    }

    public Object getY() {
        return y;
    }


   public   Object getValue(Object obj){

        return  t;
    }

    public static void main(String[] args)
    {

        Supplier<String>supplier= new Supplier<String>() {
            @Override
            public String get() {
                return "supplier";
            }
        };

        GenericClassAnchorBracket<String,Supplier<String>> e= new GenericClassAnchorBracket<String,Supplier<String>>("hi", supplier);

        Object x =e.y.get();

            System.out.println(e.getValue("hirfdd")  + x.toString());


        Consumer<String> consumer=  new Consumer<String>() {
            @Override
            public void accept(String s) {

                System.out.println("Consumer accepted "+ s) ;
            }

        };


        consumer.accept(supplier.get());
        Consumer c= consumer.andThen(consumer);

    }
}
