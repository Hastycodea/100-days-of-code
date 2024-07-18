package Day29;

public class Instructor extends User {
    private String qualification;
    private String coursesTaught;
    private int salary;

    public Instructor(String firstName, String lastName, String qualification, String coursesTaught, int salary) {
        super(firstName, lastName);
        this.qualification = qualification;
        this.coursesTaught = coursesTaught;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public String getCoursesTaught() {
        return coursesTaught;
    }

    public int getSalary() {
        return salary;
    }

    public int incrementSalary(int percent) {
        return this.salary = this.salary + (this.salary * percent/100);
    }

    public int incrementSalary(int percent, int bonus) {
        int plusPercent = incrementSalary(percent);
        return plusPercent + bonus;
    }

    public String getFullname() {
        return "Prof. "+this.getFirstName() + " " + this.getLastName();
    }


    @Override
    public String toString() {
        return "Instructor [qualification=" + qualification + ", coursesTaught=" + coursesTaught + ", salary=" + salary
                + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
    }

    public static void main(String[] args) {
        Instructor john = new Instructor("john", "omwaka", "doctor", "Computer", 4000);
        // System.out.println(john.toString());
        // System.out.println(john.getEmail());
        System.out.println(john.getFullname());
    }

}
