package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Ejercicio3Test {
	@Test
	void testNotNull() {
		Ejercicio3 ejercicio3 = new Ejercicio3();

		assertNotEquals(ejercicio3, null);
	}

	@ParameterizedTest
	@ValueSource(strings = {"1", "12", "123", "1234"})
	void testLengthTooShort(String passw) {
		Ejercicio3 ejercicio3 = new Ejercicio3();

		assertEquals("Password demasiado corto", ejercicio3.enmascarado(passw));
	}

	@ParameterizedTest
	@ValueSource(strings = {"12345", "123456", "1234567", "12345678"})
	void testLengthBetween5And8(String passw) {
		Ejercicio3 ejercicio3 = new Ejercicio3();

		assertEquals("********", ejercicio3.enmascarado(passw));
	}

	@ParameterizedTest
	@ValueSource(strings = {"123456789012",
							"1234567890123",
							"123456789012345678901234567890123456789",
							"1234567890123456789012345678901234567890"})
	void testLengthBetween12And40(String passw) {
		Ejercicio3 ejercicio3 = new Ejercicio3();

		assertEquals("************", ejercicio3.enmascarado(passw));
	}

	@ParameterizedTest
	@ValueSource(strings = {"12345678901234567890123456789012345678901",
							"123456789012345678901234567890123456789012",
							"1234567890123456789012345678901234567890123",
							"12345678901234567890123456789012345678901234"})
	void testLengthTooLong(String passw) {
		Ejercicio3 ejercicio3 = new Ejercicio3();

		assertEquals("Password demasiado largo", ejercicio3.enmascarado(passw));
	}

	@ParameterizedTest
	@ValueSource(strings = {"123456789", "1234567890", "12345678901"})
	void testLengthBetween9And11(String passw) {
		Ejercicio3 ejercicio3 = new Ejercicio3();

		assertEquals("", ejercicio3.enmascarado(passw));
	}
}