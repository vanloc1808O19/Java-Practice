public class Ch6CarpetPrice {
    public static void main(String[] args) {
        System.out.println("5   10  15 20  25");

        for (int width = 11; width <= 20; width++) {
            System.out.print(width + " ");

            for (int length = 5; length <= 25; length += 5) {
                int price = width * length * 19;
                System.out.print(" " + price);
            }

            System.out.println();
        }
    }
}
