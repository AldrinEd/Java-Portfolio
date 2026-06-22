package Projects;

import java.util.Scanner;

public class TicTacToe {
    
    public static String[] inputLetter(String[]board, int inputNum, String turn){
        Scanner sc = new Scanner(System.in);        
     
            if(board[inputNum-1].equals(String.valueOf(inputNum))){
                board[inputNum-1] = turn;
                displayBoard(board);
                
            } else{
                System.out.print("Slot already taken; re-enter slot number: ");
                inputNum = sc.nextInt();
                inputLetter(board, inputNum, turn);
            }
        
        
        return board;
    }

    public static String[] displayBoard(String[] board){

        for (int i = 0; i < board.length; i++){
            if(i % 3 == 0){
                if(i == 0){
                    System.out.println("\n|---|---|---|");
                    System.out.print("| " + board[i] + " ");
                    continue;
                }
            System.out.print("|");    
            System.out.println("\n|---|---|---|");
            System.out.print("| " + board[i] + " ");
            }
            else{
                System.out.print("| " + board[i] + " ");
            }

        }
        System.out.println("|");
        System.out.println("|---|---|---|\n");
        return board;
    }

    public static boolean checkWinner(String[] board, int inputNumber){
        boolean isWinner = false;
        String row;
        String column;
        String diagonal;
        switch (inputNumber) {
            case 1:{
            
                row = board[0] + board[1] + board[2];
                column = board[0] + board[3] + board[6];
                diagonal = board[0] + board[4] + board[8];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1 || diagonal.chars().distinct().count() == 1){
                    isWinner = true;
                }

                break;
            }
                
                
            case 2:{
            
                row = board[0] + board[1] + board[2];
                column = board[1] + board[4] + board[7];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1){
                    isWinner = true;
                }

                break;
            }

            case 3:{
            
                row = board[0] + board[1] + board[2];
                column = board[2] + board[5] + board[8];
                diagonal = board[2] + board[4] + board[6];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1 || diagonal.chars().distinct().count() == 1){
                    isWinner = true;
                }

                break;
            }

            case 4:{
            
                row = board[3] + board[4] + board[5];
                column = board[0] + board[3] + board[6];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1){
                    isWinner = true;
                }

                break;
            }

            case 5:{
            
                row = board[3] + board[4] + board[5];
                column = board[1] + board[4] + board[7];
                String diagonal1 = board[0] + board[4] + board[8];
                String diagonal2 = board[2] + board[4] + board[6];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1){
                    
                    isWinner = true;
                }

                if (diagonal1.chars().distinct().count() == 1 || diagonal2.chars().distinct().count() == 1){
                    isWinner = true;
                }

                break;
            }

            case 6:{
            
                row = board[3] + board[4] + board[5];
                column = board[2] + board[5] + board[8];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1){
                    isWinner = true;
                }

                break;
            }

            case 7:{
            
                row = board[6] + board[7] + board[8];
                column = board[0] + board[3] + board[6];
                diagonal = board[2] + board[4] + board[6];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1 || diagonal.chars().distinct().count() == 1 ){
                    isWinner = true;
                }

                break;
            }

            case 8:{
            
                row = board[6] + board[7] + board[8];
                column = board[1] + board[4] + board[7];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1){
                    isWinner = true;
                }

                break;
            }

            case 9:{
            
                row = board[6] + board[7] + board[8];
                column = board[2] + board[5] + board[8];
                diagonal = board[2] + board[4] + board[6];

                if (row.chars().distinct().count() == 1 || column.chars().distinct().count() == 1 || diagonal.chars().distinct().count() == 1 ){
                    isWinner = true;
                }

                break;
            }
        
            default:
                break;
        }
        
        return isWinner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] board = new String[9];
        String turn = "X";
        int draw = board.length;
        boolean isDone = false;

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1); 
        }

        displayBoard(board);

        System.out.print("X will play first. Enter a slot number to place X in: ");
        
        for(int i = 0; i < board.length; i++){
                   
            while(draw != 0){
                int inputNumber = sc.nextInt();
                inputLetter(board, inputNumber, turn);
                boolean isWinner = checkWinner(board, inputNumber);
                
                if(isWinner){
                    System.out.print(turn + ", You win!");
                    isDone = true;
                    break;
                }
                draw--; 
                if(turn == "X" && draw !=0){
                    turn = "O";
                    System.out.print("O's turn; enter a slot number to place O in: ");
                }else if(turn == "O" && draw !=0){
                    turn = "X";
                    System.out.print("X's turn; enter a slot number to place X in: ");
                } 
            }
            if(isDone){
                break;
            }
        }

        if(draw == 0){
            System.out.println("Draw! Thanks for playing.");
        }
        sc.close();
    }
}
