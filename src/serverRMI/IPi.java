package serverRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPi extends Remote {
    double calcularPi(int num_steps) throws RemoteException;
}
