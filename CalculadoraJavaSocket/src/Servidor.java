
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonatan
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            // Instancia o ServerSocket ouvindo a porta 12345
            ServerSocket servidor = new ServerSocket(12345);
            while (true) {
                // o método accept() bloqueia a execução até que
                // o servidor receba um pedido de conexão
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

                //servidor recebe a solicitacao de calculo de operacao
                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                Calculo c = (Calculo) entrada.readObject();
                System.out.println("servidor recebeu dados do cliente....." +  "Conta a realizar: " + c.n1 + " " + c.operacao + " " + c.n2);
                                               
                switch (c.operacao) {
                    case "+" : c.resposta = c.n1 + c.n2;
                               break;
                    case "-" : c.resposta = c.n1 - c.n2;
                               break;
                    case "/" : c.resposta = (int)c.n1 / c.n2;
                               break;
                    case "*" : c.resposta = c.n1 * c.n2;
                               break;
                    default : c.resposta = -27;   
                }

                //servidor enviando resposta ao cliente
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(c);
                saida.close();
                cliente.close();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
