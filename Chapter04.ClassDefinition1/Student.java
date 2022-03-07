public class Student {
    // data member
    private String name;

    private String email;

    // constructor
    public Student() {
        name = "unknown";
        email = "unknown";
    }

    // return the email of this student
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setEmail(String e) {
        email = e;
    }
}
