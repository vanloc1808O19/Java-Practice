public class RoomWinner {
    public static void main(String[] args) {
        LotteryCard one, two, three;

        one = new LotteryCard();
        two = new LotteryCard();
        three = new LotteryCard();

        one.spin();
        two.spin();
        three.spin();

        System.out.println("Card 1: " + one.getNumber() + " " + one.getColor());
        System.out.println("Card 2: " + two.getNumber() + " " + two.getColor());
        System.out.println("Card 3: " + three.getNumber() + " " + three.getColor());
    }    
}
