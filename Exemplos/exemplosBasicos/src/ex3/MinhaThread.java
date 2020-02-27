/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.awt.Font;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Jhonatan
 */
public class MinhaThread extends Thread{
    
    JTextArea texto;
    
    public MinhaThread(JTextArea textArea){
        texto = textArea;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            texto.append(i+"\n");
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
