import java.util.*;
public class employee {
    static void sortEmployeeId(int arr[]){
        for(int i=0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter no of employee : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter employee id : ");
        int employeeId[] = new int[n];

        for(int i=0;i<n;i++){
            employeeId[i] = sc.nextInt();
        }
        
        sortEmployeeId(employeeId);
        
        System.out.print("Sorted employee Id : ");
        for(int i=0;i<n;i++){
            System.out.print(employeeId[i] + " ");
        }
    }
}
