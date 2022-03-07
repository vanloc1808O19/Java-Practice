public class Librarian {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Emma");
        student.setEmail("vanloc1808@gmail.com");

        LibraryCard card1 = new LibraryCard();
        card1.setOwner(student);
        card1.checkOut(3);

        LibraryCard card2 = new LibraryCard();
        card2.setOwner(student);

        System.out.println("Card1 Info: " + card1.toString() + "\n");
        System.out.println("Card2 Info: " + card2.toString() + "\n");
    }
}
