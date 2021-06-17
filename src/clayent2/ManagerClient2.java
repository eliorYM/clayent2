/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clayent2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author elior studies
 */
public class ManagerClient2 {
    
    ObjectOutputStream out;
    Object obj;
    Socket s = null;
    
    public ManagerClient2() throws IOException{
       // GraphicsClient2 g = new GraphicsClient2();
        // TODO code application logic here
        try {
            s = new Socket("localhost",130);
            System.out.println("yaaaa");
        } catch (Exception e) {
        System.err.println("zzzzzzz");
        }
         listin2 connect = new listin2(s);
        connect.start();
        Scanner S = new Scanner(System.in);
        
        
        while (true) { 
            
            obj = S.nextInt();
            out = new ObjectOutputStream(s.getOutputStream());
            out.writeObject(obj);

        }
    }
}