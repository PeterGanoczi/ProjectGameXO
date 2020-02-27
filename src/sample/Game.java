package sample;

public class Game {

    private Field field;
    private State state;

    public Game() {
        this.field = field;
        this.state = State.READY;
    }

    public void startGame(){
        if (state==State.READY){
            state=State.RUNNING;
        }
    }

    public void resetGame(){
        if (state!=State.READY){
            state=State.READY;
            this.field=null;
        }
    }

    public void endGame(){
        if (state!=State.RUNNING){
            state= State.OVER;
            this.field=null;
        }
    }

    public void nextMove(int code){
        if (state==State.RUNNING){
            field.toggleTiles(code);
        }
        if (field.isWinner()){
            state=State.OVER;
        }
    }
}
