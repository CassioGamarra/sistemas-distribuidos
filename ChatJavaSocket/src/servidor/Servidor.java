/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jhonatan
 */
public class Servidor {
    public Servidor(){}
    
    PrintWriter enviar;
    public void servidor(FrameServidor frame) throws IOException{
        int numeroPorta = Integer.parseInt(frame.getFieldPorta().getText());
        System.out.println("RODANDO....");
        ServerSocket serverSocket = new ServerSocket(numeroPorta);
        Socket clientSocket = serverSocket.accept();
        enviar = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader receber = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        new Thread() {
            @Override
            public void run() {
                String userInput;
                try {
                    while(receber.readLine() !=  null){
                        if((userInput = receber.readLine()) != null){
                            userInput = userInput +"\n";
                            frame.getTxtAreaChat().append(userInput);
                        }
                    } 
                } catch (IOException ex) {
                    Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }.start();
        
    }
    public void enviar(String apelido, String msg, FrameServidor frame){
        String serverInput;
        if(!msg.contains("Enviar mensagem...")){
            serverInput = apelido+" diz:"+msg;
            enviar.println(serverInput);
            frame.getTxtAreaChat().append(serverInput+"\n");
        }
    }
}
