import java.util.*;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int i = 0;i<marks.length;i++) {
            marks[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0;i<marks.length;i++) {
            total += marks[i];
        }
        System.out.println("Total Marks: " + total);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<marks.length;i++) {
            if(marks[i] < min) {
                min = marks[i];
            }
            if(marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Minimum Marks: " + min);
        System.out.println("Maximum Marks: " + max);
        float average = (float) total / n;
        System.out.printf("Average Marks: %.2f\n", average);

        for(int i = 0;i<marks.length;i++) {
            if(marks[i] >= 40) {
                System.out.println("The student is passed in the subject " + (i + 1) + " with marks: "+ marks[i]);
            } else {
                System.out.println("The student is failed in the subject " + (i+1) + " with marks: "+ marks[i]);
            }
        }
        sc.close();
    }
    
}
