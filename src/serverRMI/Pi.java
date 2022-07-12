package serverRMI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
 
public class Pi extends UnicastRemoteObject implements IPi{
    
    public Pi() throws RemoteException{
        super();
    }

    public double calcularPi(int num_steps) throws RemoteException {
    	System.out.println("Iniciando cálculo de pi para " + num_steps + " steps");
        int i; 
        double x, pi, sum = 0.0;
        double step = 1.0/(double) num_steps;

        for (i=0; i < num_steps; i++){
            x = (i + 0.5) * step; // Largura do retângulo
            sum = sum + 4.0 / (1.0 + x*x); // Sum += Area do retângulo
        }	
        pi = step * sum;

        return pi;
    }
}
