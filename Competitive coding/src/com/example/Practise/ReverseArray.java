package com.example.Practise;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int j = arr.length-1;
        int n = 0;
        if(j%2==0){
            n = j/2;
        }
        else{
            n = j/2 + 1 ;
        }

        for(int i =0; i<n; i++){
            int index1 = arr[i];
            arr[i]=arr[j];
            arr[j]=index1;
            j--;
        }

        for( int i : arr){
            System.out.print(i + " ");
        }
    }
}
