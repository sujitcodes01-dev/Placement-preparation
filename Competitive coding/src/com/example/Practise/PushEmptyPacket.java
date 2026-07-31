package com.example.Practise;

public class PushEmptyPacket {

    public static void main(String[] args) {
        int [] arr =  {4,5,0,1,9,0,5,0};

        int j = arr.length -1 ;
        for(int i=0; i< j; i++){
            if(arr[i] == 0){
                for(int k = i; k<j; k++){
                    arr[k] = arr[k+1];
                }
                arr[j] = 0;
                j--;
            }
        }

        for(int x : arr){
            System.out.print(x +" ");
        }

    }
}
