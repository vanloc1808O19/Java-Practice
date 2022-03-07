public class LibraryCard {
    // data members
    private Student owner;

    private int borrowCount;

    public LibraryCard() {
        owner = null;
        borrowCount = 0;
    }

    //checkout
    public void checkOut(int numOfBooks) {
        borrowCount += numOfBooks;
    }

    public Student getOwner() {
        return owner;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setOwner(Student s) {
        owner = s;
    }

    public String toString() {
        return "Owner: " + owner.getName() + "; Email: " + owner.getEmail() + "; Borrow Count: " + borrowCount;
    }
}
