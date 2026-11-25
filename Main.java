import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students to register: ");
        int count = Integer.parseInt(input.nextLine().trim());

        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Registering student " + (i + 1) + " of " + count + " ---");

            System.out.print("Roll number    : ");
            String rollNumber = input.nextLine();

            System.out.print("Name           : ");
            String name = input.nextLine();

            System.out.print("Gender (M/F)   : ");
            char gender = input.nextLine().trim().toUpperCase().charAt(0);

            System.out.print("Date of birth  : ");
            String dob = input.nextLine();

            System.out.print("Place of birth : ");
            String pob = input.nextLine();

            System.out.print("Academic year  : ");
            String academicYear = input.nextLine();

            System.out.print("Faculty        : ");
            String faculty = input.nextLine();

            System.out.print("Class          : ");
            String studentClass = input.nextLine();

            students[i] = new Student(rollNumber, name, gender, dob, pob,
                                      academicYear, faculty, studentClass);
        }

        System.out.println("\n===== LIST OF REGISTERED STUDENTS =====");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1));
            students[i].display();
        }

        input.close();
    }
}
