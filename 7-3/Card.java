public class Card {

    public Card {
        /* implementation not shown */
    }

    public static void main(String[] args) {
        Card[][] cardMatrix = ; //...

        int v = 10;

        for (Card[] row : cardMatrix) {
            for (Card c : row) {
                c.changeValue(v);
            }
        }

        // why can we use an enhanced for loop?
        // because you are using a mutator/setter function, instead of REPLACING the card objects

        Card valCard = ; // a card with the value v inside
        for (int r = 0; r < cardMatrix.length; r++) {
            for (int c = 0; c < cardMatrix[r].length; c++) {
                cardMatrix[r][c] = valCard;
            }
        }

    }

    // setter / mutator
    public void changeValue(int newValue) {
        value = newValue;
    }
}
