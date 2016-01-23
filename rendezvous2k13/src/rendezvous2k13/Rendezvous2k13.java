/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezvous2k13;

import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.net.*;
/**
 *
 * @author Gowtham
 */
public class Rendezvous2k13 {

    static JFrame mainframe;
    

    public Rendezvous2k13() {
        mainframe=new JFrame("Welcome to Rendezvous 2k13");     
        
        welcome_panel wp=new welcome_panel();
        mainframe.add(wp);
        mainframe.setVisible(true);
        mainframe.setDefaultCloseOperation(3);
        mainframe.pack();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Rendezvous2k13 rend=new Rendezvous2k13();

       
        
    }
}
