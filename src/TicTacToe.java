import java.util.*;

public class TicTacToe {


    static   ArraysList<Integer> playerPositions = new ArrayList<Integer>();
    static   ArraysList<Integer> cpuPositions = new ArrayList<Integer>();


    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};


        while (true) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9):");
            int PlayerPos = scan.nextInt();
            placePiece(gameBoard, PlayerPos, "player");
            Random rand = new Random(); // importing the libor
            int cpuPos = rand.nextInt(9) + 1;
            // It is taking the number form 1 to 9 in the array
            placePiece(gameBoard, cpuPos, "cpu");
            printGameBoard(gameBoard);
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }


    }

    public  static void placePiece(char[][] gameBoard, int pos,String user) {

        char symbol = ' ';

       if(user.equals("player")){
           symbol ='x';
       } else if (user.equals("cpu")){
           symbol ='0';
       }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;

//                    gameBoard[0][0]  |  gameBoard[0][2]  |  gameBoard[0][4]
//                    -----------------|-------------------|-----------------
//                    gameBoard[2][0]  |  gameBoard[2][2]  |  gameBoard[2][4]
//                    -----------------|-------------------|-----------------
//                    gameBoard[4][0]  |  gameBoard[4][2]  |  gameBoard[4][4]

        }
    }
    public  static  String checkWinner()
    {
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(1,5,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning= new ArrayList<List>();
        winning.add(topRow);

        return " ";
    }
}

