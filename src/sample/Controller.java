package sample;

import javafx.event.ActionEvent;

import javafx.scene.control.Button;

import java.util.EventObject;

public class Controller {
    public Button btnResetGame;
    public Button btnEndGame;
    public Button btnNewGame;
    private Game game;


    public Controller(){
        game=new Game();
    }

    public void clickBtn(ActionEvent event) {

        System.out.println(((Button)event.getSource()).getId());
        String temp=((Button) event.getSource()).getId().substring(3);
        int value=Integer.parseInt(temp);
        game.nextMove(value);
    }

    public void clickNewGame(ActionEvent event){
        game.startGame();
    }
}
