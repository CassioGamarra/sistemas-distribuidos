/**
 * Métodos da bola
 * @author Jhonatan
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;


public class Bola implements Runnable {
    //Variáveis globais
    int x, y, direcaoX, direcaoY;
    Rectangle bola;
    //Classe Jogador
    Jogador jogador1 = new Jogador(10,210,1); 
    Jogador jogador2 = new Jogador(770,210,2);
    //Placar
    int placarJogador1, placarJogador2;
    
    //SOM
    TocarSom somJogador1 = new TocarSom("audio/jogador1.wav");
    TocarSom somJogador2 = new TocarSom("audio/jogador1.wav");
    //Imagem da bola
    Image imagemBola;
    
    public Bola(int x, int y){
      placarJogador1 = placarJogador2 = 0;
      
      this.x = x;
      this.y = y;
      Random rand = new Random(); //Cria números randômicos para uso da posição.
      int randXDir = rand.nextInt(1);
      if(randXDir == 0){
          randXDir--;
      }
      setDirecaoX(randXDir);
      
      int randYDir = rand.nextInt(1);
      if(randYDir == 0){
          randYDir--;
      }
      setDirecaoY(randYDir);
      
      bola = new Rectangle(this.x, this.y, 20,20);
      
    }
    
    //Para setar a direção X da bola
    public void setDirecaoX(int xDir){
        direcaoX = xDir;
    }
    //Para setar a direção Y da bola
    public void setDirecaoY(int yDir){
        direcaoY = yDir;
    }
    
    //Desenhando
    public void draw(Graphics g){
        Toolkit tk = Toolkit.getDefaultToolkit();
        java.net.URL urlBola = getClass().getResource(("img/bola.png")); //Busca a imagem da bola na pasta IMG
        imagemBola = tk.getImage(urlBola);
        g.drawImage(imagemBola, this.bola.x, this.bola.y, null);
    }
    
    //Método para colisão
    public void colisao(){
        //Para a colisão com o Jogador 1
        if(bola.intersects(jogador1.jogador)){
            somJogador1.tocarSom();
            setDirecaoX(+1);
        }
        //Para colisão com o Jogador 2
        if(bola.intersects(jogador2.jogador)){
            somJogador2.tocarSom();
            setDirecaoX(-1);
        }
    }
    
    //Método da movimentação
    public void mover(){
        colisao();
        bola.x += direcaoX;
        bola.y += direcaoY;
        
        //Realiza o movimento da bola
        if(bola.x <= 0){
            bola.x = jogador1.x+20;
            bola.y = jogador1.getDirecaoY()+40;//jogador1.y+40;
            placarJogador2++;
            setDirecaoX(+1);
        }
        if(bola.x>=785){
            bola.x = jogador2.x-20;
            bola.y = jogador2.getDirecaoY()+40;//jogador2.y+40;
            placarJogador1++;
            setDirecaoX(-1);
        }
        if(bola.y <= 0){
            setDirecaoY(+1);
        }
        if(bola.y >= 465){
            setDirecaoY(-1);
        }
    }
    
    //Thread que inicia o movimento
    public void run(){
        try{
            while(true){
                mover();
                Thread.sleep(2);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
