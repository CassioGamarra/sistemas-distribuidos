import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
    
    static String valores;
    
    public Cliente(){}

    public void calcular(CalculadoraFrame calc, String valores){
        try {
            Socket cliente = new Socket("localhost", 12345);
            
            //cliente enviando conta para ser calculada no servidor
            Calculo c = new Calculo(valores);
            ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
            saida.flush();
            saida.writeObject(c);
            
            System.out.println("Enviando para o servidor ..........");
            
            //servidor responde a solicitacao de calculo de operacao
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            c = (Calculo)entrada.readObject();
            calc.getFieldNumeros().setText(String.valueOf(c.resposta));
            //JOptionPane.showMessageDialog(null, "Resultado da operacao: " + c.resposta);
            entrada.close();
            saida.close();
            cliente.close();
            System.out.println("Conexão encerrada");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
