public class ThreadSimples extends Thread{
    public ThreadSimples(String msg){
        super(msg);
    }
    @Override
    public void run(){
        int vezes = 0;
        if(getName().equals("Cássio")){
            vezes = 10;
        }
        if(getName().equals("UFN")){
            vezes = 20;
        }
        if(getName().equals("Zamberlindo")){
            vezes = 5;
        }
        for(int i = 0; i < vezes; i++){
            System.out.println(getName());
            /*try{
                sleep(200);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }*/
        }
    }
}
