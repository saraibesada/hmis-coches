package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio2Test {
	@Test
	void testNotNull() {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertNotEquals(ejercicio2, null);
	}

	@Test
	void testUsernameEmpty() {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertFalse(ejercicio2.login("", "Password8"));
	}

	@Test
	void testPasswordEmpty() {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertFalse(ejercicio2.login("Username", ""));
	}

	@ParameterizedTest
	@CsvSource({"'', Password8",
				"Username,''",
				"'', ''"})
	void testEmpty(String user, String passw) {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertFalse(ejercicio2.login(user, passw));
	}

	@ParameterizedTest
	@CsvSource({"123456789012345678901234567890, 'Password8'",
				"1234567890123456789012345678901, 'Password8'",
				"'Username', 123456789012345678901234567890",
				"'Username', 1234567890123456789012345678901",
				"123456789012345678901234567890, 123456789012345678901234567890",
				"123456789012345678901234567890, 1234567890123456789012345678901",
				"1234567890123456789012345678901, 123456789012345678901234567890",
				"1234567890123456789012345678901, 1234567890123456789012345678901"})
	void testLengthEqualPlus30(String user, String passw) {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertFalse(ejercicio2.login(user, passw));
	}

	@ParameterizedTest
	@CsvSource({"Username, passWord",
				"Username, PASSWORD",
				"Username, password3"})
	void testWrongPassword(String user, String passw) {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertFalse(ejercicio2.login(user, passw));
	}

	@Test
	void testExists() {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertTrue(ejercicio2.login("Username", "Password8"));
	}

	@ParameterizedTest
	@CsvSource({"Username, WrongPassword",
				"WrongUsername, Password8",
				"WrongUsername, WrongPassword"})
	void testDoesNotExist(String user, String passw) {
		Ejercicio2 ejercicio2 = new Ejercicio2();

		assertFalse(ejercicio2.login(user, passw));
	}
}