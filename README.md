# Serie-Fibonacci-Version-1.0

La serie de Fibonacci se comienza con el 0 y 1, susecivamente se sumara el antecesor y el sucesor.

0 + 1 = 1

que dando asi 0,1,1

1 + 1 = 2

0,1,1,2

1 + 2 = 3

0,1,1,2,3

2 + 3 = 5

0,1,1,2,3,5

3 + 5 = 8

0,1,1,2,3,5,8

5 + 8 = 11

0,1,1,2,3,5,8

5 + 8 = 13

etc,etc.

Una propuesta para resolver este algoritmo se muestra en el diagrama de flujo siguiente.

![image](https://user-images.githubusercontent.com/41167366/46510365-63cf8d80-c7fd-11e8-82d2-201c87308245.png)


Se codificara en el lenguaje de programación Java

![image](https://user-images.githubusercontent.com/41167366/46510468-0556df00-c7fe-11e8-99a5-e1e4531cd145.png)

# La propuesta del programa es la siguiente, para la clase Fibonacci:

package com.ignacio.modelo;

public class Fibonacci {
	private int contador = 0;
	private int contador1 =0 ;
	private int contador2 = 1;
	private int contador3 = 0;
	private int contador4 = 0;
	
	
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public int getContador1() {
		return contador1;
	}
	public void setContador1(int contador1) {
		this.contador1 = contador1;
	}
	public int getContador2() {
		return contador2;
	}
	public void setContador2(int contador2) {
		this.contador2 = contador2;
	}
	public int getContador3() {
		return contador3;
	}
	public void setContador3(int contador3) {
		this.contador3 = contador3;
	}
	public int getContador4() {
		return contador4;
	}
	public void setContador4(int contador4) {
		this.contador4 = contador4;
	}
	
}

# Para la clase ControlFibonacci:

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

# Nuestra clase principal que contiene el método main quedara de la siguiente forma :


package AplicacionFibonacci;

import pbas.ignacio.controlFibonacci.ControlFibonacci;

public class AppFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlFibonacci controlfibo = new ControlFibonacci();
		
		int valorcontador4 = controlfibo.numerodeciclos();
		controlfibo.ciclos(valorcontador4);
		
	}

}

# Caso de uso 1
# Se calcula la serie de Fibonacci para el número 6

![image](https://user-images.githubusercontent.com/41167366/46510846-320bf600-c800-11e8-85d6-2f0fe5305cda.png)



