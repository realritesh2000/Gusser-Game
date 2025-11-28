import java.util.Scanner;

// Guesser class: picks a number
class Guesser {
    int guessNum;

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser, kindly guess a number : ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Player class: each player guesses a number
class Player {
    int guessNum;

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player, kindly guess a number : ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

// Umpire class: collects numbers and compares
class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }

    public void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();
    }

    public void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All players guessed correctly! It's a tie.");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and Player 2 won!");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and Player 3 won!");
            } else {
                System.out.println("Player 1 won!");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and Player 3 won!");
            } else {
                System.out.println("Player 2 won!");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won!");
        } else {
            System.out.println("No one guessed correctly. Guesser wins!");
        }
    }
}

// Main class
public class GuesserGame {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
