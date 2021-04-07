package sudoku.problemdomain.userinterface;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import sudoku.problemdomain.SudokuGame;

public class UserInterfaceImpl implements IUserInterfaceContract.View {
    EventHandler<keyEvent>{

    }

    private  final Stage stage;
    private final Group root;

    @Override
    public  void handle(KeyEvent keyEvent){

    }

    @Override
    public void setListener(IUserInterfaceContract.EventListener listener) {

    }

    @verride
    public void updateSquare(int x, int y, int input) {

    }

    @Override
    public void updateBoard(SudokuGame game) {

    }

    @Override
    public void showDialog(String message) {

    }

    @Override
    public void showError(String message) {

    }
}
