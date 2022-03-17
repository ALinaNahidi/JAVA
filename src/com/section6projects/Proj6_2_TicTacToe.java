package com.section6projects;

import java.util.Arrays;
import java.util.Scanner;


public class Proj6_2_TicTacToe {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        String[][] board = new String[3][3];

        initializeGame(board);
        printBoard(board);
        runGame(board);
    }

    private static void initializeGame(String[][] board) {
        for (String[] strings : board) Arrays.fill(strings, "");
    }

    private static void runGame(String[][] board) {
        while (true) {

            if (isBoardFull(board)) {
                System.out.println("It is a tie");
                break;
            }

            xCall(board);
            printBoard(board);
            if (getWinner(board, "X")) {
                System.out.println("X is winner!!!");
                break;
            }

            if (isBoardFull(board)) {
                System.out.println("It is a tie");
                break;
            }

            oCall(board);
            printBoard(board);
            if (getWinner(board, "O")) {
                System.out.println("O is winner!!!");
                break;
            }

        }
    }

    private static boolean getWinner(String[][] board, String player) {
        if (rowMatchForWinner(board, player)) return true;
        if (columMatchForWinner(board, player)) return true;

        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player))
            return true;
        else return board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player);
    }

    private static boolean columMatchForWinner(String[][] board, String player) {
        int counter;
        for (int i = 0; i < board.length; i++) {
            counter = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i].equals(player))
                    counter += 1;
            }
            if (counter == 3)
                return true;
        }
        return false;
    }

    private static boolean rowMatchForWinner(String[][] board, String player) {
        int counter;
        for (String[] strings : board) {
            counter = 0;
            for (String string : strings) {
                if (string.equals(player))
                    counter += 1;
            }
            if (counter == 3)
                return true;
        }
        return false;
    }

    private static void xCall(String[][] board) {

        System.out.println("It is X's tern");
        System.out.println("Please enter the row and then column (0,1 or 2)");

        int row;
        int col;

        while (true) {

            row = scanner.nextInt();
            col = scanner.nextInt();

            if (isBoardFull(board)) {
                System.out.println("Board is full");
                break;
            }

            if (!(cellAlreadyOccupied(row, col, board))) {
                board[row][col] = "X";
                break;
            }

            System.out.println("Cell is already occupied please reenter the values!");
        }
    }

    private static void oCall(String[][] board) {

        System.out.println("It is Y's tern");
        System.out.println("Please enter the row and then column (0,1 or 2)");

        int row;
        int col;

        while (true) {

            row = scanner.nextInt();
            col = scanner.nextInt();

            if (isBoardFull(board)) {
                System.out.println("Board is full");
                break;
            }

            if (!(cellAlreadyOccupied(row, col, board))) {
                board[row][col] = "O";
                break;
            }

            System.out.println("Cell is already occupied please reenter the values!");
        }
    }


    private static void printBoard(String[][] board) {
        for (int i=0;i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
                if (j == 2) {
                    System.out.println();
                    break;
                }
                System.out.print(" | ");
            }
            if(i<2)
            System.out.println("- - - - - - -");

        }
    }//End of PrintBoard

    private static boolean isBoardFull(String[][] board) {
        for (String[] strings : board) {
            for (String string : strings) {
                if (string.equals("")) return false;
            }
        }
        return true;
    }

    private static boolean cellAlreadyOccupied(int row, int col, String[][] board) {
        return  !(board[row][col].equals(""));
    }


}

