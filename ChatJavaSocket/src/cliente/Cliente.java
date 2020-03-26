/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jhonatan
 */
public class Cliente {
    public Cliente(){}
    
    PrintWriter enviar;
    public void cliente(FrameCliente frame) throws IOException{
        String endereco = frame.getFieldEndereco().getText();
        int numeroPorta = Integer.parseInt(frame.getFieldPorta().getText());
        
        Socket echoSocket = new Socket(endereco, numeroPorta);
        enviar= new PrintWriter(echoSocket.getOutputStream(), true);
        BufferedReader receber = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        
        new Thread(){
            public void run(){
                String serverInput;
                try {
                    while(receber.readLine() != null){
                        if((serverInput = receber.readLine()) != null){
                            serverInput = serverInput +"\n";
                            frame.getTxtAreaChat().append(serverInput);
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
        
    }
    public void enviar(String apelido, String msg, FrameCliente frame){
        String userInput;
        if(!msg.contains("Enviar mensagem...")){
            userInput = apelido+" diz:"+msg;
            enviar.println(userInput);
            frame.getTxtAreaChat().append(userInput+"\n");
        }
    }
}
