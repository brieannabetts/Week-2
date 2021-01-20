import java.util.Scanner;

public class CreateACard {
    public static void main(String[] args) {

        //Create a Scanner
        //datatype  object name         calling the constructor
        Scanner     scanner       = new Scanner(System.in);
        Card        aceOfSpades   = new Card("Ace","Spades",14);
        Card        twoOfHearts   = new Card("two","Hearts",13);

        //on lines 9 and 10 we instantiated 2 Card objects


        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);
    }
}
