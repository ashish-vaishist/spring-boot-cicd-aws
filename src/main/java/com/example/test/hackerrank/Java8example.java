package com.example.test.hackerrank;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Java8example {


   static boolean func(Employee e){
       if( e.getName().charAt(0)=='A'){
           return true;
       }
       return false;
    }


    public static void main(String[] args) {

        List<Employee> employees= new ArrayList<>();

        employees.add(new Employee(1,"Ashish"));
        employees.add(new Employee(2,"Rishabh"));
        employees.add(new Employee(3,"Anuj"));
        employees.add(new Employee(4,"Vinay"));
        employees.add(new Employee(5,"Ajeet"));
        employees.add(new Employee(6,"Harsh"));


        Predicate<Employee> p= i-> i.getName().charAt(0)=='A';


        //Filtr and Predicate
        employees= employees.stream().filter(p)
                //n->func(n))
            //    n-> n.getName().charAt(0)=='A')
                .collect(Collectors.toList());



        System.out.println(employees.toString());
       HashSet<Employee>hashSet= employees.stream().collect(HashSet::new,HashSet::add,HashSet::addAll);
        System.out.println(hashSet.toString());
        HashSet<String>hashSet1= employees.stream().map(Employee::getName).collect(HashSet::new,HashSet::add,HashSet::addAll);
        System.out.println(hashSet1.toString());

        HashMap<Integer,String> hashMap= (HashMap<Integer, String>) employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));

        System.out.println(hashMap.toString());

      //  hashMap= (HashMap<Integer, String>) hashMap.entrySet().stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
        System.out.println(hashMap.toString());

       Double d= (Double) employees.stream().collect(Collectors.averagingInt(Employee::getId));
       System.out.println(d);


        IntStream im=  employees.stream().mapToInt(Employee::getId);

       int c=  im.reduce(0,(n, m)->n+m );
        System.out.println(c);

        //Bifunctional
        BiFunction<Integer,Integer,Integer> b=(n,m)->n*m;

       b=   b.andThen(n->n<6?0:n*n);
      int z=  b.apply(2,4);

        System.out.println(z);
    }


}
