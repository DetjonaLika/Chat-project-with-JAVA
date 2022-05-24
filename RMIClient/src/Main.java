import javax.swing.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
 
public class Main {
   private void doTest(){
        try {
            // fire to localhost port 1999
            Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1", 1999);
            // search for myMessage service
            Message impl = (Message) myRegistry.lookup("myMessage");
            // call server's method        
            impl.sayHello("Pershendetje:");

          int i =0;
            while (i<10){
                    i++;
                String s = JOptionPane.showInputDialog("Sheno Mesazhin:");

                impl.sayHello(s);

            }




            //impl.sayHello("Bote");
            System.out.println("Message Sent");
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
     
    public static void main(String[] args) {
        Main main = new Main();
        main.doTest();
    }
}