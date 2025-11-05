import java.lang.Thread;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hola mundo");
        int cont=0;
        while(true){
             try {
                cont++;
                 System.out.println("mensaje #:"+cont+"Hello wordl..");
                 Thread.sleep(1000);
             } catch (Exception e){
                 System.out.println("se interrumpi el hili...");
             }
        }
    }
}