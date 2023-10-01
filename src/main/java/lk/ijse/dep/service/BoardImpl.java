package lk.ijse.dep.service;

import lk.ijse.dep.controller.BoardController;

import static lk.ijse.dep.service.Board.NUM_OF_COLS;
import static lk.ijse.dep.service.Board.NUM_OF_ROWS;
public class BoardImpl implements Board{
    public BoardImpl(){
        Piece[][]pieces = new Piece[NUM_OF_ROWS][NUM_OF_COLS];
        BoardUI boardUI = new BoardUI() {
            @Override
            public void update(int col,boolean isHuman) {

            }
            @Override
            public void notifyWinner(Winner winner){

            }
            @Override
            public int hashCode(){return super.hashCode();}
        };
        for(int i = 0;i<NUM_OF_ROWS;i++){
            for(int j =0;j<NUM_OF_COLS;j++){
                pieces[i][j] = Piece.EMPTY;
            }
        }
    }
    public BoardImpl(object boardController){

    }
    @Override
    public BoardUI getBoardUI(){
        return null;
    }
}
