
/* 
Java Program to find reverse of an array.
Java Program to find reverse of an array  using temp variable.
Java Program to print minimum and maximum element in an array.


 */

 import java.util.*;
public class BasicOperations {

public static void reverseArray(int[] arr){
    //using collections
    Integer[] arr2 = new Integer[arr.length];
    for(int i=0;i<arr.length;i++){
        arr2[i]=arr[i];
    }
    Collections.reverse(Arrays.asList(arr2));
    
    System.out.println(Arrays.asList(arr2));
    

}
public static void reverseArray2(int[] arr){
    //usinh new array
    int n=arr.length-1;
    int[] arr2 = new int[arr.length];
    for(int i=0;i<arr.length;i++){
        arr2[i]=arr[n-i];

    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr2[i] + " ");

    }

}
public static void reverseArray3(int[] arr){
    
       int i=0;
       int j=arr.length-1;
       while(i<j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
       for(int k=0;k<arr.length;k++){
        System.out.println(arr[k] + " ");

       }
}
public static void minMax(int[] arr){
    //using collections
    Arrays.sort(arr);
    System.out.println("Min " +  arr[0]);
    System.out.println("Max " +  arr[arr.length-1]);
}
public static void minMax2(int[] arr){
    int min=arr[0];
    int max=arr[0];
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        else if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println(" Max " + max);
    System.out.println(" Min " + min);
}
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter array size");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("using collections");
        reverseArray(arr);
        System.out.println("using new array");
        reverseArray2(arr);
        System.out.println("using swap");
        reverseArray3(arr);
        System.out.println("Min amd max in array");
        minMax(arr);
        System.out.println("Min amd max in array using a varable");
        minMax2(arr);
        
    }
    
}
