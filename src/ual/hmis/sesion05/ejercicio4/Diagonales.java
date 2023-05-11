package ual.hmis.sesion05.ejercicio4;

public class Diagonales {
	public static double[][] obtenerDiagonales(double[][] mat) {
	    int num = mat.length;
	    double[][] result = new double[2][num];

	    for (int i = 0; i < num; i++) {
	    	result[0][i] = mat[i][i]; 
	    	result[1][i] = mat[i][num - 1 - i]; 
	    }

	    return result;
	}

	public static double[] suma(double[][] mat) {
	    int num = mat.length;
	    double[] result = new double[num];

	    for (int j = 0; j < num; j++) {
	        double suma = .0;
	        for (int i = 0; i < num; i++) {
	            suma += mat[i][j];
	        }
	        result[j] = suma;
	    }

	    return result;
	}
}