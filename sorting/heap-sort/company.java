import java.util.Scanner;

public class company {

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int leftNode = 2 * i + 1;
        int rightNode = 2 * i + 2;

        if (leftNode < n && arr[i] < arr[leftNode]) {
            largest = leftNode;
        }
        if (rightNode < n && arr[largest] < arr[rightNode]) {
            largest = rightNode;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, rightNode);
        }
    }

    static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // recursive call
            heapify(arr, i, 0);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter job Application  : ");

        int job = sc.nextInt();

        int salary[] = new int[job];

        System.out.print("Enter Salary : ");
        for (int i = 0; i < job; i++) {
            salary[i] = sc.nextInt();
        }

        heapSort(salary);

        System.out.print("Sorted Salary : ");

        for (int i = 0; i < job; i++) {
            System.out.print(salary[i] + " ");
        }

    }
}
