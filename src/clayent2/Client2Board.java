/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clayent2;

import ser.Board;
import ser.PrintBoard;

/**
 *
 * @author elior studies
 */
public class Client2Board {
    
      public Client2Board(){
        pb = new PrintBoard();
    }
    PrintBoard pb;
    Board bord;

    public void setBord(Board bord) {
        this.bord = bord;
    }
    public void printBoardClient(){
        pb.printBoard(bord);
    }
}
