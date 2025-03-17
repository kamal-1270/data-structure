// package data-structure.sorting.selection-sort;

import java.util.Scanner;

public class university {
    static void SortExamScore(int score[]){
        for(int i=0; i<score.length;i++){
            int minIndex = i;
            for(int j=i+1; j<score.length;j++){
                if(score[minIndex] > score[j]){ 
                    minIndex = j;   
                }
            }
                int temp = score[i];
                score[i] = score[minIndex];
                score[minIndex] = temp;
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of student : ");
    int student = sc.nextInt();

    System.out.print("Enter exam score : ");
    int examScore[] = new int[student];

    for(int i=0;i<student;i++){
        examScore[i] = sc.nextInt();
    }

    SortExamScore(examScore);
    System.out.print("sorted exam score : ");
    for(int i=0;i<student;i++){
        System.out.print(examScore[i] + " ");
        }
   } 
}
