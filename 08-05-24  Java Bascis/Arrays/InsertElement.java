//Java Program to insert an element at the beginning of an array.
//Java Program to insert an element at end location in an array.
//Java Program to insert an element at a given index in an array.

import java.util.Scanner;

public class InsertElement {

    public static void insertAtBeginning(int[] arr1 , int num){
        int n=arr1.length-1;
        for(int i=n;i>0;i--){
            arr1[i]=arr1[i-1];
        }
        arr1[0]=num;
        System.out.println("After addition at Beggining " );
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
            
        }


    }
    public static void insertAtEnd(int[] arr2 , int num){

        arr2[arr2.length-1]=num;
        System.out.println("After addition at end " );
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
            
        }
        
    }
    public static void insertAtIndex(int[] arr3 , int num ,int index){
         int n=arr3.length-2;
         System.out.println("general");
         for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
         }
        if(index>n)
        {
            System.out.println(" Enter a valid index");
        }
        for(int i=n;i>=index ;i--){

            arr3[i+1]=arr3[i];

        }
        arr3[index]=num;
        System.out.println("After addition at index " + index );
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
            
        }

    
        
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter array size");
        int n=sc.nextInt();
        int[] arr= new int[n+1];
        System.out.println(" Enter array elements");
        for(int i=0; i< n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to insert");
        int num=sc.nextInt();
        insertAtIndex(arr,num,3);
        insertAtEnd(arr,num);
       insertAtBeginning(arr,num);
       
    }
    
}
