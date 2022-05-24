import javax.swing.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 
public class MessageImpl extends UnicastRemoteObject implements Message {
 
    public MessageImpl() throws RemoteException {       
    }
     
    
    @Override
    public void sayHello(String name) throws RemoteException {
        System.out.println("Tung "+name);

        JOptionPane.showMessageDialog(null,name);
    }
     
}