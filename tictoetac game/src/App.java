import board.Board;
import java.util.Scanner;
import player.Player;
import game.Game;

public class App{

        public static void main(String[] args) throws Exception{
            System.out.println("First Project -> Tic Tac Toe");
            Board b = new Board(3,'-');
            b.printBoardConfig();

            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter the name of Player 1: ");
            String name  = scn.nextLine();
            System.out.println("Please enter the symbol of the Player1: ");
            char symbol = scn.nextLine().charAt(0);





         Player p1 = new Player();
          p1.setPlayerNameAndSymbol(name,symbol);
          p1.getPlayerNameAndSymbol();

        Player p2 = new Player();
        p2.setPlayerNameAndSymbol("khushbu",'O');
            p2.getPlayerNameAndSymbol();
           Game game = new Game(new Player[]{p1,p2} ,b);
            game.play();

        }
    }
