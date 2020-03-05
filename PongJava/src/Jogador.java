/**
 *
 * @author Jhonatan
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Jogador implements Runnable {
    //Variáveis globais
    int x, y, direcaoY, id;
    Rectangle jogador;
    Image ImagemJogador1;
    Image ImagemJogador2;
    
    public Jogador(int x, int y, int id){
        this.x = x;
        this.y = y;
        this.id = id;
        
        jogador = new Rectangle(x, y, 20, 80);
    }
    
    //Evento KeyPressed
    public void keyPressed(KeyEvent e){
        switch(id){
            //Para o jogador 1
            case 1:
                if(e.getKeyCode() == e.VK_W){
                    setDirecaoY(-2);
                }
                if(e.getKeyCode() == e.VK_S){
                    setDirecaoY(2);
                }
                break;
            case 2:
                if(e.getKeyCode() == e.VK_UP){
                    setDirecaoY(-2);
                }
                if(e.getKeyCode() == e.VK_DOWN){
                    setDirecaoY(2);
                }
                break;
            default:
                System.out.println("Id incorreto");
                break;
        }
    }
    
    //Evento KeyReleased
    public void keyReleased(KeyEvent e){
        switch(id){
            //Para o jogador 1
            case 1:
                if(e.getKeyCode() == e.VK_W){
                    setDirecaoY(0);
                }
                if(e.getKeyCode() == e.VK_S){
                    setDirecaoY(0);
                }
                break;
            case 2:
                if(e.getKeyCode() == e.VK_UP){
                    setDirecaoY(0);
                }
                if(e.getKeyCode() == e.VK_DOWN){
                    setDirecaoY(0);
                }
                break;
            default:
                System.out.println("Id incorreto");
                break;
        }
    }
    
    //Seta a direção no eixo Y
    public void setDirecaoY(int dirY){
        direcaoY = dirY;
    }
    
    public int getDirecaoY(){
        return jogador.y;
    }
    
    //Movimento
    public void mover(){
        jogador.y += direcaoY;
        if(jogador.y <= 30){
            jogador.y = 30;
        }
        if(jogador.y >= 390){
            jogador.y = 390;
        }
    }
    
    //Desenha o jogador na tela
    public void draw(Graphics g){
        Toolkit tk = Toolkit.getDefaultToolkit();
        java.net.URL player1 = getClass().getResource("img/jogador.png");//Pega a imagem
        ImagemJogador1 = tk.getImage(player1);
        java.net.URL player2 = getClass().getResource("img/jogador.png");
        ImagemJogador2 = tk.getImage(player2);
      
        switch(id){
            //Para o jogador 1
            case 1:
                g.drawImage(ImagemJogador1, this.jogador.x, this.jogador.y, null);
                break;
            //Para o jogador 2
            case 2:
                g.drawImage(ImagemJogador2, this.jogador.x, this.jogador.y, null);
                break;
            default:
                System.out.println("Id incorreta!");
        }
    }
    
    @Override
    public void run() {
        try{
            while(true){
                mover();
                Thread.sleep(4);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
