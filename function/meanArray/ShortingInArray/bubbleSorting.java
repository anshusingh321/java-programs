package meanArray.ShortingInArray;

import java.util.Arrays;

public class bubbleSorting {
    public static void BubbleSorting(int arr[]){
        for(int turn = 0;turn<arr.length;turn++){
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1]; //0(n^2)
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    //selection Short
    public static void selectionShort(int arr[]){
        for(int i = 0;i<arr.length ;i++){
            int minPos = i;
            for(int j = i+1;j<arr.length  ;j++){
                if(arr[minPos]>arr[j]){ //dectresing order ke liye (<)
                    minPos = j;
                    
                }
            } 
            
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }
    // ye increasing way ke liye apply
    //inbuilt sort
    //import java.util.Arrays;
    //Arrays.sort(arr); OR
     // Arrays.sort(arr,si(0), ei(3)) do number ke bich ka increacing nikalna ho tab
    //si = starting index  , ei = ending index
    // ye decreasing way ke liye apply
    //import java.util.collection;

    //Arrays.sort(arr,Collection.reverseOrder())

    // do number ke bich ka decreacing nikalna ho tab
    
    //Arrays.sort(arr,si,ei,Collections.reverseOrder())

    public static void insertionShort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert

            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    
    public static void main(String[] args){
        int arr[] = {5,4,1,3,2};
        //insertionShort(arr);//selectionShort(arr);//BubbleSorting(arr);
         Arrays.sort(arr, 0 ,3);
        //Arrays.sort(arr);
        printArr(arr);
        
    }
}
