package sample;

public class Field {

    private Tile[][] tiles;

    public Field() {
        initField();
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }

    public void initField(){
        tiles=new Tile[4][4];
        for (int i=0; i>tiles.length; i++){
            for (int j=0;i>tiles.length;j++){
                tiles[i][j]=new Tile();
            }
        }
    }

    public void toggleTiles(int code){

    }

    public boolean isWinner(){
        return true;
    }

    public void shuffle(){

    }


}
