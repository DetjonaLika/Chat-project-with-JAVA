
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
 
public class Main {
     
    private void startServer(){
        try {
            // create on port 1999
            Registry registry = LocateRegistry.createRegistry(1999);
             
            // create a new service named myMessage
            registry.rebind("myMessage", new MessageImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }     
        System.out.println("system is ready");
    }
     
    public static void main(String[] args) {
        Main main = new Main();
        main.startServer();
    }
}