package Q4;

import java.util.Scanner;

public class StudentAttendanceManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int m = scan.nextInt();
        System.out.println("Enter the Number of weeks");
        int w = scan.nextInt();
        int[][] attendance = new int[m][w];
        for (int i = 0; i < m; i++) {
                System.out.println("For Student  " + (i + 1) + ": ");
                for (int j = 0; j < w; j++) {
                    while (true) {
                    System.out.println("Week " + (j + 1) + ": (1 For Present 0 For Absent) ");
                    attendance[i][j] = scan.nextInt();
                    if (attendance[i][j] == 0 || attendance[i][j] == 1) {
                        break;
                    }else{
                        System.out.println("Enter Valid Attendance");
                    }
                }
            }
        }
        int[] studentAttendance = new int[m];
        int[] weekAttendance = new int[w];
        int attendanceCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < w; j++) {
                studentAttendance[i] += attendance[i][j];
                weekAttendance[j] += attendance[i][j];
                attendanceCount+= attendance[i][j];
            }
        }

        // Display student attendance records
        System.out.println("\nTotal Attendance per Student:");
        for (int i = 0; i < m; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentAttendance[i] + " days present");
        }

        // Display weekly attendance
        System.out.println("\nTotal Attendance per Week:");
        for (int j = 0; j < w; j++) {
            System.out.println("Week " + (j + 1) + ": " + weekAttendance[j] + " students present");
        }

        // Compute class average attendance
        double averageAttendance = (double) attendanceCount / (m * w) * 100;
        System.out.printf("\nAverage Class Attendance: %.2f%%\n", averageAttendance);

        // Find students with the best and worst attendance
        int bestStudent = 0, worstStudent = 0;
        for (int i = 1; i < m; i++) {
            if (studentAttendance[i] > studentAttendance[bestStudent]) {
                bestStudent = i;
            }
            if (studentAttendance[i] < studentAttendance[worstStudent]) {
                worstStudent = i;
            }
        }

        // Display best and worst attendance
        System.out.println("\nStudent with Best Attendance: Student " + (bestStudent + 1) + " (" + studentAttendance[bestStudent] + " days present)");
        System.out.println("Student with Worst Attendance: Student " + (worstStudent + 1) + " (" + studentAttendance[worstStudent] + " days present)");

        scan.close();
    }
}

