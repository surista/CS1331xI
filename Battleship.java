import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] player1Board = new char[5][5];
        char[][] player2Board = new char[5][5];
        char[][] player1TargetHistory = new char[5][5];
        char[][] player2TargetHistory = new char[5][5];
        char[][] playerBoard = new char[5][5];
        char[][] opponentBoard = new char[5][5];
        char[][] playerTarget = new char[5][5];

        int p1Int1, p1Int2, playerHits, player, opponent;
        int player1Hits = 0;
        int player2Hits = 0;
        boolean turnComplete = false;

        int turn = 1;

        // initialize player boards with '-'
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                player1Board[col][row] = '-';
            }
        }

        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                player2Board[col][row] = '-';
            }
        }

        // initiate the target history boards
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                player1TargetHistory[col][row] = '-';
            }
        }

        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                player2TargetHistory[col][row] = '-';
            }
        }


        // get P1 ships and update player's board
        System.out.println("Welcome to Battleship!\n");
        System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");

        player1Board = initialBoard(player1Board);
        printBattleShip(player1Board);

        // get p2 ships and update player's board
        System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");

        player2Board = initialBoard(player2Board);
        printBattleShip(player2Board);


        // Start of player turns, 'turn' starts at 1

        do {
            if (turn % 2 == 1) {
                player = 1;
                opponent = 2;
                playerBoard = player1Board;
                opponentBoard = player2Board;
                playerTarget = player1TargetHistory;
                playerHits = player1Hits;
            } else {
                player = 2;
                opponent = 1;
                playerBoard = player2Board;
                opponentBoard = player1Board;
                playerTarget = player2TargetHistory;
                playerHits = player2Hits;
            }

            System.out.printf("Player %d, enter row/column:\n", player);

            // This section validates the two coordinates.

            if (!input.hasNextInt()) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }
            p1Int1 = input.nextInt();

            if (!input.hasNextInt()) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }

            p1Int2 = input.nextInt();

            if (p1Int1 < 0 || p1Int1 > 4 || p1Int2 < 0 || p1Int2 > 4) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }


            if (playerTarget[p1Int1][p1Int2] != '-') {
                System.out.println("You already fired on this spot. Choose different coordinates.");
                continue;
            }

            if (opponentBoard[p1Int1][p1Int2] == '-') {
                opponentBoard[p1Int1][p1Int2] = 'O';
                playerTarget[p1Int1][p1Int2] = 'O';
                System.out.printf("PLAYER %ds MISSED!\n", player);
                printBattleShip(playerTarget);
                turn += 1;
            } else if (opponentBoard[p1Int1][p1Int2] == '@') {
                opponentBoard[p1Int1][p1Int2] = 'X';
                playerTarget[p1Int1][p1Int2] = 'X';
                System.out.printf("PLAYER %d HIT PLAYER %d's SHIP!\n", player, opponent);
                printBattleShip(playerTarget);
                playerHits += 1;
                turn += 1;
            }
            if (player == 1) {
                player1Board = playerBoard;
                player2Board = opponentBoard;
                player1TargetHistory = playerTarget;
                player1Hits = playerHits;
                if (player1Hits == 5) {
                    System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
                    break;
                }
            } else {
                player2Board = playerBoard;
                player1Board = opponentBoard;
                player2TargetHistory = playerTarget;
                player2Hits = playerHits;
                if (player2Hits == 5) {
                    System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
                    break;
                }
            }
        } while (player1Hits != 5 && player2Hits != 5);
        System.out.println("Final boards:\n");
        printBattleShip(player1Board);
        System.out.println(" ");
        printBattleShip(player2Board);
    }

    // Use this method to print game boards to the console.
    private static void printBattleShip(char[][] player) {
        System.out.print("  ");
        for (int row = -1; row < 5; row++) {
            if (row > -1) {
                System.out.print(row + " ");
            }
            for (int column = 0; column < 5; column++) {
                if (row == -1) {
                    System.out.print(column + " ");
                } else {
                    System.out.print(player[row][column] + " ");
                }
            }
            System.out.println("");
        }
    }


    public static char[][] initialBoard(char[][] player) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int p1Int1, p1Int2;
        do {
            System.out.printf("Enter ship %d location:\n", i);
            if (!input.hasNextInt()) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }
            p1Int1 = input.nextInt();

            if (!input.hasNextInt()) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }
            p1Int2 = input.nextInt();

            if (p1Int1 < 0 || p1Int1 > 4 || p1Int2 < 0 || p1Int2 > 4) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
                continue;
            }

            if (player[p1Int1][p1Int2] == '@') {
                System.out.println("You already have a ship there. Choose different coordinates.");
                continue;
            }
            player[p1Int1][p1Int2] = '@';
            i++;
        } while (i < 6);
        return player;
    }

}
