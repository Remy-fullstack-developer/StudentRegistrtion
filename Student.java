public class Student {
    private String rollNumber;
    private String name;
    private char gender;
    private String dateOfBirth;
    private String placeOfBirth;
    private String academicYear;
    private String faculty;
    private String studentClass;

    public Student(String rollNumber, String name, char gender, String dateOfBirth,
                   String placeOfBirth, String academicYear, String faculty, String studentClass) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.academicYear = academicYear;
        this.faculty = faculty;
        this.studentClass = studentClass;
    }

    public String getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public char getGender() { return gender; }
    public String getDateOfBirth() { return dateOfBirth; }
    public String getPlaceOfBirth() { return placeOfBirth; }
    public String getAcademicYear() { return academicYear; }
    public String getFaculty() { return faculty; }
    public String getStudentClass() { return studentClass; }

    public void display() {
        System.out.println("Roll Number   : " + rollNumber);
        System.out.println("Name          : " + name);
        System.out.println("Gender        : " + gender);
        System.out.println("Date of Birth : " + dateOfBirth);
        System.out.println("Place of Birth: " + placeOfBirth);
        System.out.println("Academic Year : " + academicYear);
        System.out.println("Faculty       : " + faculty);
        System.out.println("Class         : " + studentClass);
    }
}
