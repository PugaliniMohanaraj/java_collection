import java.util.Scanner;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Create an array to store student data
        Student[] students = new Student[n];

        // Get student data from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter score: ");
            int score = scanner.nextInt();
            scanner.nextLine();

            students[i] = new Student(name, score);
        }

        // Sort using simple bubble sort in descending order of scores
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].score < students[j + 1].score) {
                    // Swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display the sorted list
        System.out.println("\nStudents sorted by scores (high to low):");
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + ": " + students[i].score);
        }

        scanner.close();
    }
}
