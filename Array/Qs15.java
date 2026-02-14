public class Qs15 {

    public static boolean nimGame(int[] piles) {
        int nimSum = 0;

        for (int pile : piles) {
            nimSum ^= pile;
        }

        return nimSum != 0;
    }

    public static void main(String[] args) {
        int[] piles = {3, 4, 5};

        if (nimGame(piles)) {
            System.out.println("First player wins");
        } else {
            System.out.println("First player loses");
        }
    }
}
