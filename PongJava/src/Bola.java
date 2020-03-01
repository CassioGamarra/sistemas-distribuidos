/**
 * Métodos da bola
 * @author Jhonatan
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import static sun.applet.AppletResourceLoader.getImage;

public class Bola implements Runnable {
    //Variáveis globais
    int x, y, direcaoX, direcaoY;
    Rectangle bola;
    //Classe Jogador
    Jogador jogador1 = new Jogador(15,140,1); 
    Jogador jogador2 = new Jogador(770,140,2);
    //Placar
    int placarJogador1, placarJogador2;
    
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
        java.net.URL urlBola = getClass().getResource(("img/bola.png")); //Busca a imagem da bola na pasta IMG
        imagemBola = getImage(urlBola);
        g.drawImage(imagemBola, this.bola.x, this.bola.y, null);
    }
    
    //Método para colisão
    public void colisao(){
        //Para a colisão com o Jogador 1
        if(bola.intersects(jogador1.jogador)){
            setDirecaoX(+1);
        }
        //Para colisão com o Jogador 2
        if(bola.intersects(jogador2.jogador)){
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
            setDirecaoX(+1);
            placarJogador2++;
        }
        if(bola.x>=785){
            setDirecaoX(-1);
            placarJogador1++;
        }
        if(bola.y <= 0){
            setDirecaoY(+1);
        }
        if(bola.y >= 485){
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