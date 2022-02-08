package tictactoe;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        char[][] uran = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int k = 0;  k < 3; k++) {
                uran[i][k] = ' ';
            }
        }
        System.out.println("---------");
        System.out.println("| " + uran[0][0] + " " + uran[0][1] + " " + uran[0][2] + " |");
        System.out.println("| " + uran[1][0] + " " + uran[1][1] + " " + uran[1][2] + " |");
        System.out.println("| " + uran[2][0] + " " + uran[2][1] + " " + uran[2][2] + " |");
        System.out.println("---------");
        int counter = 0;
        while (true) {
            System.out.print("Enter the coordinates: ");
            if (!scanner.hasNextInt()) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            } else {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if (x > 3 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (uran[x - 1][y - 1] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    if (counter % 2 == 0) {
                        uran[x - 1][y - 1] = 'X';
                    } else {
                        uran[x - 1][y - 1] = 'O';
                    }
                    counter++;
                    System.out.println("---------");
                    System.out.println("| " + uran[0][0] + " " + uran[0][1] + " " + uran[0][2] + " |");
                    System.out.println("| " + uran[1][0] + " " + uran[1][1] + " " + uran[1][2] + " |");
                    System.out.println("| " + uran[2][0] + " " + uran[2][1] + " " + uran[2][2] + " |");
                    System.out.println("---------");
                    if (status(uran) == 'X') {
                        System.out.println("X wins");
                        break;
                    } else if (status(uran) == 'O') {
                        System.out.println("O wins");
                        break;
                    } else if (counter == 9) {
                        System.out.println("Draw");
                        break;
                    }
                }
            }
        }

    }
    public static char status(char[][] uran) {
        if (uran[0][0] == 'X' && uran[0][1] == 'X' && uran[0][2] == 'X'
                || uran[1][0] == 'X' && uran[1][1] == 'X' && uran[1][2] == 'X'
                || uran[2][0] == 'X' && uran[2][1] == 'X' && uran[2][2] == 'X'
                || uran[0][0] == 'X' && uran[1][0] == 'X' && uran[2][0] == 'X'
                || uran[0][1] == 'X' && uran[1][1] == 'X' && uran[2][1] == 'X'
                || uran[0][2] == 'X' && uran[1][2] == 'X' && uran[2][2] == 'X'
                || uran[0][0] == 'X' && uran[1][1] == 'X' && uran[2][2] == 'X'
                || uran[0][2] == 'X' && uran[1][1] == 'X' && uran[2][0] == 'X') {
            return ('X');
        } else if (uran[0][0] == 'O' && uran[0][1] == 'O' && uran[0][2] == 'O'
                || uran[1][0] == 'O' && uran[1][1] == 'O' && uran[1][2] == 'O'
                || uran[2][0] == 'O' && uran[2][1] == 'O' && uran[2][2] == 'O'
                || uran[0][0] == 'O' && uran[1][0] == 'O' && uran[2][0] == 'O'
                || uran[0][1] == 'O' && uran[1][1] == 'O' && uran[2][1] == 'O'
                || uran[0][2] == 'O' && uran[1][2] == 'O' && uran[2][2] == 'O'
                || uran[0][0] == 'O' && uran[1][1] == 'O' && uran[2][2] == 'O'
                || uran[0][2] == 'O' && uran[1][1] == 'O' && uran[2][0] == 'O') {
            return ('O');
        } else {
            return ('E');
        }
    }
}