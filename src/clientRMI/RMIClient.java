package clientRMI;

import serverRMI.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMIClient {
	
	public static void main(String[] args) throws Exception {
		String objectName = "rmi://localhost:1099/Pi";
		IPi pi = (IPi) Naming.lookup(objectName);
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Insira o numero de steps:");
		int num_steps = reader.nextInt();
		
		System.out.println("O resultado para " + num_steps + " é: " + pi.calcularPi(num_steps));
		
	}
}
 