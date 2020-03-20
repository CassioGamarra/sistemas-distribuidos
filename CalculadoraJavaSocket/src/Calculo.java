
import java.io.Serializable;

/**
 *
 * @author Jhonatan
 */
public class Calculo implements Serializable{
    int n1;
    int n2;
    String operacao;
    int resposta;
    
    public Calculo(String valores){
        String[] valoresRecebido = {};
        if(valores.contains("+")){
            valoresRecebido = valores.split("\\+");
            this.operacao = "+";
        }
        else if(valores.contains("-")){
            valoresRecebido = valores.split("-");
            this.operacao = "-";
        }
        else if(valores.contains("x")){
            valoresRecebido = valores.split("x");
            this.operacao = "*";
        }
        else{
            valoresRecebido = valores.split("/");
            this.operacao = "/";
        }
         
        String num1 = "";
        String num2 = "";
        
        num1 = valoresRecebido[0];
        num2 = valoresRecebido[1];
        
        this.n1 = Integer.parseInt(num1);
        this.n2 = Integer.parseInt(num2);
        
        //this.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe primeiro valor inteiro"));
       // this.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe segundo valor inteiro"));

       // this.operacao = JOptionPane.showInputDialog(null, "Informe a operacao [+ - / *]");
    }
    
}
