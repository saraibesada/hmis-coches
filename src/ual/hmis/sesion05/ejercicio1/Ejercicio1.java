package ual.hmis.sesion05.ejercicio1;

public class Ejercicio1{
	
	public int transformar (int x) {
		int resultado = 0;
		
		if (x % 2 == 0) // % Resto de una división entre enteros (mod)
			resultado = transformar (x/2);
		else if (x % 3 == 0)
			resultado = transformar (x/3);
		else if (x % 5 == 0)
			resultado = transformar (x/5);
		else return x;
		return resultado;
	}
 }