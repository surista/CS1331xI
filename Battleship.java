import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] player1 = new char[5][5];
        char[][] player2 = new char[5][5];
        char[][] player1TargetHistory = new char[5][5];
        char[][] player2TargetHistory = new char[5][5];

        int p1Int1, p1Int2, player, opponent;

        boolean turnComplete = false;

        int player1Hits = 0;
        int player2Hits = 0;
        int turn = 1;

        // initialize player boards with '-'
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                player1[col][row] = '-';
            }
        }

        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                player2[col][row] = '-';
            }
        }


        // get P1 ships and update player's board
        System.out.println("Welcome to Battleship!\n");
        System.out.println("PLAYER 1, ENTER YOUR SHIPS' COORDINATES.");

        player1 = initialBoard(player1, 6);
        printBattleShip(player1);

        // get p2 ships and update player's board
        System.out.println("PLAYER 2, ENTER YOUR SHIPS' COORDINATES.");

        player2 = initialBoard(player2, 6);
        printBattleShip(player2);


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

        // Start of player turns
        while (player1Hits != 5 && player2Hits != 5) {

            do {
                if (turn % 2 == 1) {
                    player = 1;
                    opponent = 2;
                } else {
                    player = 2;
                    opponent = 1;
                }

                System.out.printf("Player %d, enter row/column:\n", player);

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

                if (player1TargetHistory[p1Int1][p1Int2] != '-') {
                    System.out.println("You already fired on this spot. Choose different coordinates.");
                    continue;
                }

                if (player2[p1Int1][p1Int2] == '@') {
                    player2[p1Int1][p1Int2] = 'X';
                    player1TargetHistory[p1Int1][p1Int2] = 'X';
                    System.out.printf("PLAYER %d HIT PLAYER %d's SHIP!\n", player, opponent);
                    printBattleShip(player1TargetHistory);
                    if (player == 1) {
                        player1Hits += 1;
                    } else {
                        player2Hits += 1;
                    }
                    if (player1Hits == 5) {
                        System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
                        break;

                    } else if (player2Hits == 5) {
                        System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!\n");
                        break;
                    }
                    turnComplete = true;
                    turn += 1;
                }

                if (player2[p1Int1][p1Int2] == '-') {
                    player2[p1Int1][p1Int2] = 'O';
                    player1TargetHistory[p1Int1][p1Int2] = 'O';
                    System.out.printf("PLAYER %ds MISSED!\n", player);
                    printBattleShip(player1TargetHistory);
                    turnComplete = true;
                    turn += 1;
                }

            } while (turnComplete == false);
        }
        System.out.println("Final boards:\n");
        printBattleShip(player1);
        System.out.println();
        printBattleShip(player2);
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


    public static char[][] initialBoard(char[][] player, int counter) {
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
        } while (i < counter);
        return player;
    }
}
