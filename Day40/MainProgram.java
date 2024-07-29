package Day40;

public class MainProgram {
    public static void main(String[] args) {
        MainThread instructorThread = new MainThread("Instructors.csv");
        MainThread studentThread = new MainThread("students.csv");

        Thread instructor = new Thread(instructorThread);
        Thread student = new Thread(studentThread);

        instructor.start();
        student.start();
    }
}
