package Q3;

import java.util.Scanner;

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students you want to add");
        n=scan.nextInt();
        while(n<=0){
            System.out.println("Enter valid no. of Students");
            n=scan.nextInt();
        }
        int[] grades=new int[n];
        int highest=grades[0];
        int lowest=100;
        int sum=0;
        for(int i=0;i<n;i++) {
            while (true) {
                System.out.println("Enter the grade for Student " + (i + 1) + " 0-100");
                grades[i] = scan.nextInt();
                if (grades[i] >=0 && grades[i] <= 100) {
                    sum+=grades[i];
                    if (grades[i] > highest) {
                        highest = grades[i];
                    }
                    if (grades[i] < lowest) {
                        lowest = grades[i];
                    }
                    break;
                } else {
                    System.out.println("Invalid grade");
                }
            }
        }
        double average=sum/n;
        int aboveAverageCount=0;
        for(int grade:grades) {
            if(grade>average) {
                aboveAverageCount++;
            }
        }
        System.out.println("Average grade is "+average);
        System.out.println("Highest grade is "+highest);
        System.out.println("Lowest grade is "+lowest);
        System.out.println(aboveAverageCount+" Students have scored Above Average");
    }
}
