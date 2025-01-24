package com.Trabajo.GitTrabajo;

import java.util.Scanner;

public class Github1 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int numeroActual, numeroAnterior = Integer.MAX_VALUE;
	
	boolean consecutivosIguales = false;
	while (true) {
	System.out.print("Introduce un numero (numero negatico para terminar): ");
	numeroActual = sc.nextInt();
	
	if (numeroActual < 0) {
		break;
	}
	if (numeroActual == numeroAnterior) {
		consecutivosIguales = true;
	}
	
	numeroAnterior = numeroActual;
	
	}
sc.close();

if (consecutivosIguales) {
	System.out.println("Se han introducido el mismo numero dos veces consecutivas");
	} else {
		System.out.println("No se ha introducido el mismo numero");
	}
}
	


}

	

}
