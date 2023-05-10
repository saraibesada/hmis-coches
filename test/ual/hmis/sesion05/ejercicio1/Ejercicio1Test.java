package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import ual.hmis.sesion05.ejercicio1.Ejercicio1;

public class Ejercicio1Test {
	@Test
	void testObjectNotNull() {
		Ejercicio1 ejercicio1 = new Ejercicio1();

		assertNotEquals(ejercicio1, null);
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 7, 11, 13})
	void testClassNotMultiple(int num) {
		Ejercicio1 ejercicio1 = new Ejercicio1();

		assertEquals(num, ejercicio1.transformar(num));
	}

	@ParameterizedTest
	@CsvSource({"-4, -1",
				"-2, -1",
				"2, 1",
				"4, 1"})
	void testClassMultiple2(int num, int result) {
		Ejercicio1 ejercicio1 = new Ejercicio1();
		int Transformado = ejercicio1.transformar(num);

		assertEquals(result, Transformado);
	}

	@ParameterizedTest
	@CsvSource({"-9, -1",
				"-3, -1",
				"3, 1",
				"9, 1"})
	void testEquivalenceClassMultipleOf3(int num, int result) {
		Ejercicio1 ejercicio1 = new Ejercicio1();
		int Transformado = ejercicio1.transformar(num);

		assertEquals(result, Transformado);
	}

	@ParameterizedTest
	@CsvSource({"-25, -1",
				"-5, -1",
				"5, 1",
				"25, 1"})
	void testEquivalenceClassMultipleOf5(int num, int result) {
		Ejercicio1 ejercicio1 = new Ejercicio1();
		int Transformado = ejercicio1.transformar(num);

		assertEquals(result, Transformado);
	}
}






