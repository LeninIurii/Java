/**
*Java 1 HW3 
*@author Iurii Lenin
*@version 12.11.2021
**/
import java.util.Arrays;

public class HW3 {  

    public static void main(String args[]) {
    
        int[] arr = {1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(Ex1IntArray(arr)));
        System.out.println(Arrays.toString(Ex2EmptArray()));
        System.out.println(Arrays.toString(Ex3FortArray()));
        Ex4TwotArray();
        System.out.println(Arrays.toString(Ex5initialValue(3,4)));
        Ex6();
    }
    
    public static int[] Ex1IntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] > 0) ? 0 : 1;
        } return arr;
    }
    
    public static int[] Ex2EmptArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        } return arr;
    }
    
    public static int[] Ex3FortArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] < 6) ? arr[i]*2 : arr[i];
        } return arr;
    }
    
    public static void Ex4TwotArray() {
        int [][] arr = new int [4][4];
        for (int i = 0; i < arr.length; i++) {           
            for (int j = 0; j < arr[i].length; j++) {    
                arr[i][j]=(arr[i] == arr[arr.length - 1 - j ] || arr[i] == arr[j] ) ? 1 : arr[i][j];
              System.out.print(" " + arr[i][j] + " ");
            } System.out.println();
        }
    }
    
    public static int[] Ex5initialValue(int len, int initialValue) {
        int[] arr = new int [len];   
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        } return arr;
    }
    
    public static void Ex6() {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
        int max = arr[0];
        int min = arr[0];
        for (int i=1; i < arr.length; i++) {
           if (arr[i] < min) {
               min=arr[i];
           }
            if (arr[i] > max) {
               max=arr[i];
            }
        }System.out.println(min +"\n" + max);
                
    }

}
