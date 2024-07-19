package Day30;

public abstract class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String country;

    public User(int id, String firstName, String lastName, String email, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.country = country;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String email) {
        this.email = email;
    }

    public User(String firstName, String lastName, String email) {
        this(firstName, lastName);
        this.email = email;
    }

    // to make the methods abstract we need to define the abstract methods without providing their implementation 
    // Abstract methods
    public abstract int getId();
    public abstract void setId(int id);
    public abstract String getFirstName();
    public abstract void setFirstName(String firstName);
    public abstract String getLastName();
    public abstract void setLastName(String lastName);
    public abstract String getEmail();
    public abstract void setEmail(String email);
    public abstract String getCity();
    public abstract void setCity(String city);
    public abstract String getCountry();
    public abstract void setCountry(String country);
    public abstract String getFullname();

    @Override
    public abstract String toString();

}
