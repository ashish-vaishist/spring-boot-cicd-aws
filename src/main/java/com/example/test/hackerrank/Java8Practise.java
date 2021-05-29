package com.example.test.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Practise {


    public static void main(String [] args){


        List<Integer> list = Arrays.asList(1,2,3,4);

       list= list.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());

      System.out.println(list);

       Optional<Integer> sum = list.stream().filter(n->n%2==0).map(n->n*n).reduce((j,k)->j+k);
             //  .reduce(Integer::sum);
       System.out.println(sum.get());

   HashSet h=  list.stream().filter(n->n%2==0).map(n->n*n).collect(HashSet::new,HashSet::add,HashSet::addAll);


      System.out.println(h.toString());

        int sum1 = Arrays.stream(new int[]{1, 2, 3})
                .filter(i -> i >= 2)
                .map(i -> i * i)
                .sum();



    }
}
