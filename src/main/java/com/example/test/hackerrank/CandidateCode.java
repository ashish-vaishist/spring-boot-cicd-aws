package com.example.test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateCode {
    static List<String> al = new ArrayList<>();
    private static void findsubsequences(String s,
                                         String ans,String res)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
        if(ans.equalsIgnoreCase(res)){
            return ;
        }


        findsubsequences(s.substring(1), ans + s.charAt(0),res);

        findsubsequences(s.substring(1), ans,res);
    }
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        String[] sarr= sc.nextLine().split(" ");

        int in= Integer.parseInt(sarr[0]);


     //   findsubsequences(s,"",sc.next());
        for(int i=0;i<n;i++){

            String ss= sc.next();
            int j=0;
            for(int k=0;k<ss.length();k++){
                boolean b=false;
                for( ;j<s.length();j++){
                    if(s.charAt(j)==ss.charAt(k)){
                        b= true; break;
                    }
                }
                if(!b){
                    System.out.println("NEGATIVE");
                    break;
                }

            }
            System.out.println("POSITIVE");
         /*   if(al.contains(sc.next())){
                System.out.println("POSITIVE");
            }else{
                System.out.println("NEGATIVE");
            }*/
        }

    }
}
