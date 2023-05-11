package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TestDiagonales {
	@Test
	void testNotNull() {
		Diagonales ejercicio3 = new Diagonales();

		assertNotEquals(ejercicio3, null);
	}

	static Stream<double[][]> matrices() {
		return Stream.of(
			new double[][] {
				   				{1, 0, 0},
				   				{0, 1, 0},
				   				{1, 0, 1} 
			   			   },
			new double[][] {	
								{1, 2, 3, 4, 5},
								{0, 1, 0, 5, 0},
								{1, 0, 1, 0, 0},
								{0, 5, 3, 1, 0},
								{2, 0, 6, 4, 1} 
						   },
			new double[][] {
							   	{3, 2},
							   	{2, 6} 
						   },
			new double[][] {
							   	{1, 2, 3},
							   	{4, 1, 2},
							   	{3, 4, 1} 
						   }
		);
	}

	@ParameterizedTest
	@MethodSource("matrices")
	void testObtenerDiagonales(double[][] mat) {
	    int num = mat.length;
	    double[][] result = new double[2][num];

	    for (int i = 0; i < num; i++) {
	    	result[0][i] = mat[i][i];
	    	result[1][i] = mat[i][num - 1 - i];
	    }

		assertArrayEquals(result, Diagonales.obtenerDiagonales(mat));
	}

	@ParameterizedTest
	@MethodSource("matrices")
	void testSuma(double[][] mat) {
	    int num = mat.length;
	    double[] result = new double[num];

	    for (int j = 0; j < num; j++) {
	        double suma = .0;
	        for (int i = 0; i < num; i++) {
	            suma += mat[i][j];
	        }
	        result[j] = suma;
	    }

		assertArrayEquals(result, Diagonales.suma(mat));
	}
}