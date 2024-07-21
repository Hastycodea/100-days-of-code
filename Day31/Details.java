package Day31;

public class Details implements Instructor {

    public String getFirstName() {
        return "John";        
    }

    public String getLastName() {
        return "Kiarie";
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String toString() {
        return "name: " + getFullName();
    }
    
    
}
