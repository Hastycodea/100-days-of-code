package Day32;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kim", "Njoroge", "EEE", "FirstClass", 2013);
        Instructor instructor = new Instructor("John", "Mbugua", "Dr", "Psychology", 14300);

        System.out.println(student.getFirstName());
        System.out.println(instructor.getFirstName());
    }
}
