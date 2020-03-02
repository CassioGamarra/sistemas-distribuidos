/**
 * Frame criado utilizando a biblioteca Java AWT
 * @author Jhonatan
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class FramePong extends JFrame{
    Image imagem;
    Graphics background;
    int frameWidth = 800, frameHeight = 480; //Tamanho padrão da janela
    Dimension tamanhoTela = new Dimension(frameWidth, frameHeight);
    Image BackgroundImage; //Objeto para armazenar o background do jogo
    JFrame frame;//Nossa janela
    
    //Bola
    static Bola b = new Bola(400,240);
    
    //Nome dos jogadores
    String nomeJogador1 = "";
    String nomeJogador2 = "";
    
    //Criando o frame
    public FramePong(String nomeJogador1, String nomeJogador2)
    {
        this.nomeJogador1 = nomeJogador1;
        this.nomeJogador2 = nomeJogador2;
        setTitle("Pong");
        setSize(tamanhoTela);
        setResizable(false); //Não permite que a janela sofra alteração no tamanho
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Define que a ação padrão ao fechar é encerrar a aplicação
        setVisible(true);
        
        this.addKeyListener(new KeyListenerJogo()); //Adiciona o KeyListener
        setLocationRelativeTo(null);//Centraliza a janela
    }
    
    //Método PAINT utilizando a biblioteca Graphics
    public void paint(Graphics g)
    {
        imagem = createImage(getWidth(), getHeight()); //Captura o tamanho do frame
        background = imagem.getGraphics();
        draw(background);
        g.drawImage(imagem, 0, 0, this);//Desenha a imagem
    }
    //Método Draw
    public void draw(Graphics g){
        Toolkit tk = Toolkit.getDefaultToolkit();
        java.net.URL urlBackground = getClass().getResource("img/background.png");
        BackgroundImage = tk.getImage(urlBackground);
        g.drawImage(BackgroundImage, 0, 0,null);
        b.draw(g); //Desenha a bola
        b.jogador1.draw(g);//Desenha o jogador 1
        b.jogador2.draw(g);//Desenha o jogador 2
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.setColor(Color.WHITE);
        g.drawString(nomeJogador1+" : "+b.placarJogador1, 340 - g.getFontMetrics().stringWidth(nomeJogador1), 70);
        g.drawString(b.placarJogador2+" : "+nomeJogador2, 405, 70);
        repaint(); //"Pinta" novamente com o método Draw;
    }
    
    //Rodando
    public static void rodar(){
        int jogar; 
        
        UIManager.put("OptionPane.noButtonText", "Não");
        UIManager.put("OptionPane.yesButtonText", "Sim");
        
        do{
            jogar = JOptionPane.showConfirmDialog(null, "Estão prontos?", "INICIAR PARTIDA!", 0, 3);
        }while(jogar != 0);
        
        Thread thBola = new Thread(b);
        thBola.start();
        Thread thJogador1 = new Thread(b.jogador1); //Thread para os jogadores
        Thread thJogador2 = new Thread(b.jogador2);
        thJogador1.start();
        thJogador2.start();
    }
    
    //Classe do KeyListener do Jogo
    public class KeyListenerJogo implements KeyListener{
        //KeyPressed Event
        @Override
        public void keyPressed(KeyEvent e){
            b.jogador1.keyPressed(e); //Para o jogador 1
            b.jogador2.keyPressed(e); //Para o jogador 2
        }
        @Override
        public void keyReleased(KeyEvent e){
            b.jogador1.keyReleased(e);
            b.jogador2.keyReleased(e);
        }
        @Override
        public void keyTyped(KeyEvent e){
            /*Necessário para a implementação do KeyListener
            * não é utilizado
            */
        }
    }
}
