package pbas.ignacio.controlFibonacci;

import java.util.Scanner;
import com.ignacio.modelo.Fibonacci;

public class ControlFibonacci {

	public int numerodeciclos() {

		int recuperar = 0;
		int recuperarcontador4 = 0;
		Scanner numerodeciclos = new Scanner(System.in);
		do {
			System.out.print("Ingresa un numero entero: ");
			
			recuperar = numerodeciclos.nextInt();
		

		} while (recuperar <= 0);
		numerodeciclos.close();
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.setContador4(recuperar);
		recuperarcontador4 = fibonacci.getContador4();

		return recuperarcontador4;

	}

	public int ciclos(int ciclos) {
		
		int contador = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0; 

		int recuperaciclos = ciclos;
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.setContador4(recuperaciclos);

		contador4 = fibonacci.getContador4();
		contador = fibonacci.getContador();

		while (contador < contador4) {
		
			if (contador == 0) {
				System.out.print(contador + ",");
				contador = contador + 1;
			
			} else if (contador ==1 ) {
				System.out.print(contador + ",");
				contador = contador + 1;
			}
			else if (contador < contador4) {
				
				contador1 = fibonacci.getContador1();
				contador2 = fibonacci.getContador2();
				contador3 = fibonacci.getContador3();
				contador3 = contador1 + contador2;
			
				System.out.print(contador3 + ",");
				contador1 = contador2;
				contador2 = contador3;
				contador5 = contador3;
				contador = contador + 1;

				fibonacci.setContador(contador);
				fibonacci.setContador1(contador1);
				fibonacci.setContador2(contador2);
				fibonacci.setContador3(contador3);
				fibonacci.setContador4(contador4);
				
			}
			if (contador == contador4) {
				contador5 = contador1 + contador2;
				System.out.println(contador5);
			}
		
		}

		System.out.println("\n" + "Fin de la serie de fibonacci");
	
		return 0;

	}

}
