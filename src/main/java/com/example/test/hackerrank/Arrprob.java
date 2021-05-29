package com.example.test.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Arrprob {

    static Random random= new Random();


    static int getSecondlargestElement(int[]arr){


        int res=-1; int largest=0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]>arr[largest]){

                if(largest!=0)
                res= largest;

                largest= i;

            }else if( res!=-1 && arr[i]!=arr[largest]  && arr[i]>arr[res] ){
                res=i;

            }
        }

        System.out.println(res +"second largest ele"+ arr[res]);

        System.out.println(largest +"largest ele"+ arr[largest]);
        return res;
    }



    static void removeDuplicateSortedArr(int arr[]){  // 1,3,3,4,5,5,5 -> 1,3,4,5

        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[++j]=arr[i];
            }

        }
        j++;
        System.out.println(Arrays.toString(arr) +j);

    }



    static void movezerotoend(int[]arr){ //0,0,9,5,3,0

        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                for (;j>i;j--){
                    if(arr[j]!=0){
                        int temp= arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp; j--;
                        break;
                    }
                }
            }

            if(i>=j) break;


        }
        System.out.println(Arrays.toString(arr));

    }

    static void movezerorightlinerTime(int []arr){

        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0 ){

                if(count!=i) {
                    int t = arr[i];
                    arr[i] = arr[count];
                    arr[count] = t;
                }
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    static void freqOfSortedArr(int arr[]){
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                count++;
            }else{
                System.out.println(arr[i-1]+" ele frq"+ count);
                count=1;

            }
        }

        System.out.println(arr[arr.length-1]+" ele frq"+ count);

    }




    static void getminAnger(int n,int d){

        List<int[]> arr=new ArrayList<>();
       for(int i=0;i<n;i++){
           int a[]= new int[d];
           a[0]=random.nextInt(d);
           a[1]=random.nextInt(d);
           a[2]=random.nextInt(20);
           arr.add(a);
       }


        for(int i=0;i<n;i++){

           arr.get(i);

        }



    }

    public static int[] rearrangearreven(int [] arr,int n,int i){

        if(arr.length/2==n){
            return arr;
        }

        int min= arr[arr.length-n];

        int max=arr[n-1];

        rearrangearreven(arr,n-1,i+2);

        int j=i;
        arr[j+1]=min;
        arr[j]=max;


        return arr;
    }

    public static int[] rearrangearrodd(int [] arr,int n,int i){

        if(arr.length/2==n-1){
            return arr;
        }

        int min= arr[arr.length-n];

        int max=arr[n-1];

        rearrangearrodd(arr,n-1,i+2);

        int j=i;
        arr[j+1]=min;
        arr[j]=max;


        return arr;
    }

    static int maxIndexDiff(int arr[], int n) {



        int max=0;    int max_index=0; int min=arr[0];
        for(int i=0; i<n;i++){
            if(arr[i]>min) continue;
            else  min=arr[i];
            for(int j=n-1;j>=max_index;j--){

                if(arr[i]<=arr[j] && (j-i)>max) {

                    max=j-i;
                    max_index=j;
                    break;

                }
            }
        }

        return max;
    }

   static   long smallestpositive(long[] arr, int n){

        Arrays.sort(arr);

        if(arr[0]>1) return 1;

        //   int res=arr[i];
        for(int i=0;i<n-1;i++){
            if(arr[i]+1<arr[i+1]){
                return arr[i]+1;
            }else{
                arr[i+1]+=arr[i];

            }

        }
        return arr[n-1]+1;


    }

    static int searchInSorted(int arr[], int k,int st,int en)
    {


        if(st>en) return -1;

        if(arr[(st+en)/2]==k)
            return k;
        else if(arr[(st+en)/2]<k){
            st=(st+en)/2+1;

        }else{
            en-=(st+en)/2+1;
        }

        return  searchInSorted(arr,k,st,en);
    }

    public static void main(String[] args) {

      //  getSecondlargestElement(new int[]{2,12,22,33,4,5,8,9,23});
       // removeDuplicateSortedArr(new int[]{1,1,2,2,3,3,3,3,4,5,5,5,5,});
      //  movezerotoend(new int[]{0,0,0,0,3,5,0});
       // movezerorightlinerTime(new int[]{0,0,0,0,3,5,0});
    //    freqOfSortedArr(new int[]{0,0,0,0,3,5,5});

      //  getminAnger(5,3);

     /*   [1,1,3]
        [2,2,10]*/

       /* int a[]=  new int[]{1,2,3,4,5,6,7};
        int t=a[a.length/2];
        rearrangearrodd(a,7,0);

        if(a.length==3)
            a[a.length-1]=t;
        else{
              a[a.length-1]=a[a.length-2];
            a[a.length-2]=t;
        }


        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(rearrangearreven(new int[]{1,2,3,4,5,6},6,0)));*/


      //  System.out.println( maxIndexDiff(new int[]{1,10},2));


      //  System.out.println(8 & 12);

        System.out.println(smallestpositive(new long[]{1,1,1},3));

        System.out.println(searchInSorted(new int[]{1,2,3,4,5},5,0,4));

    }
}
