package serverRMI;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    
    public static void main(String[] args) {
        try {
            IPi pi = new Pi();
            String objectName = "rmi://localhost/Pi";

            System.out.println("Registrando o objeto " + objectName + " no RMIRegistry...");
            LocateRegistry.createRegistry(1099);
            Naming.rebind(objectName, pi);

            System.out.println("Aguardando solicitação do cliente...\n");
        } catch (Exception e){
            e.printStackTrace();
        }
    } 
}
