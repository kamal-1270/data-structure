// package data-structure.sorting.quick-sort;

import java.util.Scanner;

public class company {

    static void sortProductPrice(int productPrice[], int start, int end){
        // Base case
        if (start < end) {
            int pivot = partition(productPrice, start, end);
            sortProductPrice(productPrice, start, pivot - 1);
            sortProductPrice(productPrice, pivot + 1, end);
        }
    }

    static int partition(int productPrice[], int start, int end){
        int pivot = productPrice[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {

            if (productPrice[j] < pivot) {
                i++;
                int temp = productPrice[i];
                productPrice[i] = productPrice[j];
                productPrice[j] = temp;
            }
        }
            //    i++;
               int temp = productPrice[i+1];
               productPrice[i+1] = productPrice[end];
               productPrice[end] = temp;

               return i+1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of product : ");
        int product = sc.nextInt();

        int productPrice[] = new int[product];
        System.out.print("Enter product price : ");
        for(int i=0;i<product;i++){
            productPrice[i] = sc.nextInt();
        }

        sortProductPrice(productPrice , 0 , productPrice.length-1);
        System.out.print("Sorted product price : ");
        for(int i=0;i<product;i++){
            System.out.print(productPrice[i]+" ");
            }
    }
}
