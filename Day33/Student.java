package Day33;

import java.io.Serializable;

public class Student extends User implements Serializable{
    private String registerdCourses;
    private String grade;
    private int joiningYear;

    public Student(String firstName, String lastName, String registeredCourse, String grade, int joiningYear) {
        super(firstName, lastName);
        this.registerdCourses = registeredCourse;
        this.grade = grade;
        this.joiningYear = joiningYear;
    }

    public String getRegisterdCourses() {
        return registerdCourses;
    }

    public String getGrade() {
        return grade;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    @Override
    public String toString() {
        return "Student [registerdCourses=" + registerdCourses + ", grade=" + grade + ", joiningYear=" + joiningYear
                + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
    }

    public static void main(String[] args) {
        Student hamza = new Student("Hamza", "Kiprotich", "ECE", "A", 2017);
        System.out.println(hamza.getRegisterdCourses());
    }
    
}
