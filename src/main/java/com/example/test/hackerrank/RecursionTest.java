package com.example.test.hackerrank;


 class  S{
    public int i=1;
}
 public class RecursionTest extends S {
    RecursionTest(int i){
        this.i=i;
    }

    static void printOutput(int test) {
        if (test < 1) {
            return;
        } else {
            System.out.print(test);
            printOutput(test - 1);
            System.out.print(test);
            return;
        }
    }

    public static void main(String[] args) {

      //  printOutput(3);

        RecursionTest r= new RecursionTest(10);
        System.out.println(r.i);

    }
}
