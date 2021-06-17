/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clayent2;

import java.io.ObjectInputStream;
import java.net.Socket;
import ser.Board;

/**
 *
 * @author elior studies
 */
public class listin2 extends Thread{
    private Socket S;
    private Object obj;
    private ObjectInputStream obi;
    Client2Board C = new Client2Board();
    GraphicsClient2 GR;
    
    public listin2(Socket s){
        this.S = s;
    }
    
    @Override
    public void run(){
        
        GR = new GraphicsClient2(S);
        Object tmp;
        
        try {
            while (true) {                
                obi = new ObjectInputStream(S.getInputStream());
                Thread.sleep(25);
                tmp = obi.readObject();
                obj = tmp;
                C.setBord((Board)obj);
                C.printBoardClient();
                GR.connectGra((Board)obj);
                tmp = null;
            }
        } catch (Exception e) {
            System.err.println("not working");
        }
    }

    public Object getObj() {
        return obj;
    }

    public void setObjNull() {
        this.obj = null;
    }
    
}

