//Java Program to delete an element at the end of an array.
//Java Program to delete an element at first in an array.
//Java Program to delete an element from an array at the given index.
import java.util.*;

public class DeleteElement {

    public static void deleteAtBeggining(int[] arr)
    {
        int[]  arr1=new int[arr.length-1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i+1];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
    public static void deleteAtEnd(int[] arr)
    {
        int[] arr3=new int[arr.length-1];
        for(int i=0;i<arr3.length;i++){
            arr3[i]=arr[i];
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
    public static void deleteAtIndex(int[] arr , int index)
    {
        
        System.out.println("deleted");
        int[] arr4 = new int[arr.length-1];
        
        for(int i=0, j=0;i<arr4.length;i++){
            if(i==index){
                continue;
            }
            arr4[j++]=arr[i];
        }
        for(int i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);
        }
    }


    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        deleteAtBeggining(arr);
        deleteAtEnd(arr);
        deleteAtIndex(arr,2);
        
    }
    
}
