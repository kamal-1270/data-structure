import java.util.*;
public class bookStore {
    static void sortBookPrice(int price[] , int start , int end){
        if(start < end){
            int mid = (start+end)/2;
            // int mid = start + (end-start)/2;
            sortBookPrice(price, start, mid);
            sortBookPrice(price, mid+1, end);
            mergebook(price, start, end);
        }
    }

    static void mergebook(int price[], int start, int end){
        int mid = (start+end)/2;
        // int mid = start + (end-start)/2;
        int i = start;
        int j = mid+1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(i <= mid && j<= end){
            if(price[i] <= price[j]){
                temp.add(price[i++]);
            }else{
                temp.add(price[j++]);
            }
        }
        while(i <= mid){
            temp.add(price[i++]);
        }
        while(j <= end){
            temp.add(price[j++]);
        }

        int k = 0;

        for(int index = start; index <= end; index++){
            price[index] = temp.get(k++);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Book : ");
        int book = sc.nextInt();

        System.out.print("Enter book price : ");

        int bookPrice[] = new int[book];

        for(int i=0;i<book;i++){
            bookPrice[i] = sc.nextInt();
        }

        sortBookPrice(bookPrice, 0, bookPrice.length-1);

        System.out.print("Sorted Book price : ");

        for(int i=0; i < book ; i++){
            System.out.print(bookPrice[i] + " ");
        }
    }
}
