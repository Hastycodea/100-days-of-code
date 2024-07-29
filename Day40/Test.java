package Day40;

public class Test {
    public static void main(String[] args) {
        InstructorThread instructorThread = new InstructorThread();
        StudentThread studentThread = new StudentThread();

        Thread instructor = new Thread(instructorThread);
        Thread student = new Thread(studentThread);
        instructor.start();
        student.start();
    }
}
