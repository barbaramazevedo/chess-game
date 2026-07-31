import Chess.ChessMatch;
import boardgame.Board;
import boardgame.Position;

public class App {
    public static void main(String[] args) throws Exception {
       
        ChessMatch chessMatch= new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}
