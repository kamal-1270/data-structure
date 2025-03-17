import java.util.Scanner;
public class student {
   static void sortMarks(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a subject : ");
        int n=sc.nextInt();
        System.out.print("Enter a student marks : ");
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }

        sortMarks(marks);

        System.out.print("Sorted marks are : ");
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
