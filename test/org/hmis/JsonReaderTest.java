package org.hmis;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class JsonReaderTest {

	@Test
	void testLeerCochesJSON() {
		String filepath = "data/coches.json";
		Coche [] coches = JsonReader.leerCochesJSON(filepath);
		assertEquals (4, coches.length);
	}

	@Test
	void testLeerCochesJSONprimero() {
		String filepath = "data/coches.json";
		Coche primero = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		Coche [] coches = JsonReader.leerCochesJSON(filepath);
		assertEquals(primero, coches[2]);
		assertTrue (primero.equals(coches[2]));
		assertTrue (coches[2].equals(primero));
	}

	@Test
	void testError() {
		String filepath = "data/coches.json";
		Coche primero = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		Coche [] coches = JsonReader.leerCochesJSON(filepath);

	}

	@Test
	void testExcepcionLeerArchivo() {
		String filepath = "data/excepcion.json";
		assertDoesNotThrow(() -> JsonReader.leerCochesJSON(filepath));
	}

	@Test
	void testObjectoNoNull() {
		JsonReader jsonReader = new JsonReader();
		assertNotEquals(jsonReader, null);
	}

	@ParameterizedTest
	@CsvSource({"data/coches2.json, 1",
				"data/coches3.json, 1",
				"data/coches4.json, 1"})
	void testLeerCochesJSON(String filepath, int nCoches) {
		Coche[] coches = JsonReader.leerCochesJSON(filepath);
		assertEquals(nCoches, coches.length);
	}

	@ParameterizedTest
	@CsvSource({"data/coches2.json, Chevrolet, Camaro, 2023, 52000",
				"data/coches3.json, Ford, Mustang, 2021, 45000",
				"data/coches4.json, Toyota, Corolla, 2022, 22000"})
	void testLeerCochesJSONprimero(String filepath, String marca, String modelo, int año, int precio) {
		Coche[] coches = JsonReader.leerCochesJSON(filepath);
		Coche coche1 = new Coche (marca, modelo, año, precio);
		assertEquals(coche1, coches[0]);
		assertTrue(coche1.equals(coches[0]));
		assertTrue(coches[0].equals(coche1));
	}

	@ParameterizedTest
	@ValueSource(strings = {"data/excepcion.json", "data/coche.json", "data/otro.json"})
	void testExcepcionLeerCochesJSON(String filepath) {
		assertDoesNotThrow(() -> JsonReader.leerCochesJSON(filepath));
	}
}