import java.util.Scanner;

public class CreateACard {
    public static void main(String[] args) {
        //create a scanner
        // datatype object name    calling constructor
        Scanner scanner = new Scanner(System.in);
        Card aceOfSpades = new Card ("Ace", "Spades", 14);
        System.out.println(aceOfSpades);

    }
}
