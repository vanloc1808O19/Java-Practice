public class Bicycle {
    // data member
    private String ownerName;

    // constructor
    public Bicycle() {
        ownerName = "nobody";
    }

    // return the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }

    // assign the name of this bicycle's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }
}