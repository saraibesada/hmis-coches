package org.hmis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CocheTest {
	@Test
	void testEqualsObject() {
		Coche coche1 = new Coche ();   // Arrange
		assertTrue(coche1.equals(coche1));  // Action // Assert
	}
	
	@Test
	void testEqualsObjectNull() {
		Coche coche1 = new Coche ();   // Arrange
		Coche coche2 = null;
		assertFalse(coche1.equals(coche2));  // Action // Assert
	}
	
	@Test
	void testEqualsObjectString() {
		Coche coche1 = new Coche ();   // Arrange
		String coche2 = "";
		assertFalse(coche1.equals(coche2));  // Action // Assert
	}
	
	@Test
	void testEqualsObjectMultiple1() {
		Coche primero = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		Coche segundo = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		assertEquals(true, primero.equals(segundo));  // Action // Assert
	}
	@Test
	void testEqualsObjectMultiple2() {
		Coche primero = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		Coche segundo = new Coche ("Chevrolet", "Camaro", 2021, 52000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}
	@Test
	void testEqualsObjectMultiple3() {
		Coche primero = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		Coche segundo = new Coche ("Ford", "Camaro", 2023, 52000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}
	@Test
	void testEqualsObjectMultiple4() {
		Coche primero = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		Coche segundo = new Coche ("Chevrolet", "Mustang", 2023, 52000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}
	@Test
	void testEqualsObjectMultiple5() {
		Coche primero = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		Coche segundo = new Coche ("Chevrolet", "Camaro", 2023, 45000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsGetMarca() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		String resultado = "Chevrolet";
		assertEquals(resultado,coche1.getMarca());  // Action // Assert
	}

	@Test
	void testEqualsSetMarca() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		String resultado = "Honda";
		coche1.setMarca("Honda");
		assertEquals(resultado, coche1.getMarca());  // Action // Assert
	}

	@Test
	void testEqualsGetModelo() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		String resultado = "Camaro";
		assertEquals(resultado, coche1.getModelo());  // Action // Assert
	}

	@Test
	void testEqualsSetModelo() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		String resultado = "Civic";
		coche1.setModelo("Civic");
		assertEquals(resultado, coche1.getModelo());  // Action // Assert
	}

	@Test
	void testEqualsGetAño() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		int resultado = 2023;
		assertEquals(resultado, coche1.getAño());  // Action // Assert
	}

	@Test
	void testEqualsSetAño() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		int resultado = 2023;
		coche1.setAño(2023);
		assertEquals(resultado, coche1.getAño());  // Action // Assert
	}

	@Test
	void testEqualsGetPrecio() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		int resultado = 52000;
		assertEquals(resultado, coche1.getPrecio());  // Action // Assert
	}

	@Test
	void testEqualsSetPrecio() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		int resultado = 40000;
		coche1.setPrecio(40000);
		assertEquals(resultado, coche1.getPrecio());  // Action // Assert
	}

	@Test
	void testEqualsString() {
		Coche coche1 = new Coche ("Chevrolet", "Camaro", 2023, 52000);
		String resultado = "Coche [marca=Chevrolet, modelo=Camaro, año=2023, precio=52000]";
		assertEquals(resultado, coche1.toString());  // Action // Assert
	}

	@ParameterizedTest
	@CsvSource({"Toyota, Corolla, 2020, 22000",
				"Ford, Mustang, 2021, 45000",
				"Chevrolet, Camaro, 2023, 22000",
				"Toyota, Civic, 2022, 25000"})

	void testEqualsObjectMultiple(String marca, String modelo, int año, int precio) {
		Coche coche1 = new Coche("Chevrolet", "Camaro", 2023, 52000);
		Coche coche2 = new Coche(marca, modelo, año, precio);
		assertEquals(false, coche1.equals(coche2));
	}

	@ParameterizedTest
	@ValueSource(strings = {"Toyota", "Ford", "Chevrolet", "Honda"})

	void testGetMarca(String marca){
		Coche coche1 = new Coche(marca, "-", 0, 0);
		assertEquals(marca, coche1.getMarca());
	}

	@ParameterizedTest
	@ValueSource(strings = {"Corolla", "Mustang", "Camaro", "Civic"})

	void testGetModelo(String modelo){
		Coche coche1 = new Coche("-", modelo, 2, 2);
		assertEquals(modelo, coche1.getModelo());
	}

	@ParameterizedTest
	@ValueSource(ints = {2022, 2021, 2023, 2022})

	void testGetAño(int año){
		Coche coche1 = new Coche("-", "-", año, 2);
		assertEquals(año, coche1.getAño());
	}

	@ParameterizedTest
	@ValueSource(ints = {22000, 45000, 52000, 25000})

	void testGetPrecio(int precio){
		Coche coche1 = new Coche("-", "-", 2, precio);
		assertEquals(precio, coche1.getPrecio());
	}

	@ParameterizedTest
	@ValueSource(strings = {"Toyota", "Ford", "Chevrolet", "Honda"})

	void testSetMarca(String marca){
		Coche coche1 = new Coche("-", "-", 2, 2);
		coche1.setMarca(marca);
		assertEquals(marca, coche1.getMarca());
	}

	@ParameterizedTest
	@ValueSource(strings = {"Corolla", "Mustang", "Camaro", "Civic"})

	void testSetModelo(String modelo){
		Coche coche1 = new Coche("-", "-", 2, 2);
		coche1.setModelo(modelo);
		assertEquals(modelo, coche1.getModelo());
	}

	@ParameterizedTest
	@ValueSource(ints = {2022, 2021, 2023, 2022})

	void testSetAño(int año){
		Coche coche1 = new Coche("-", "-", 2, 2);
		coche1.setAño(año);
		assertEquals(año, coche1.getAño());
	}

	@ParameterizedTest
	@ValueSource(ints = {22000, 45000, 52000, 25000})

	void testSetPrecio(int precio){
		Coche coche1 = new Coche("-", "-", 2, 2);
		coche1.setPrecio(precio);
		assertEquals(precio, coche1.getPrecio());
	}

	@ParameterizedTest
	@CsvSource({"Toyota, Corolla, 2022, 22000",
				"Ford, Mustang, 2021, 45000",
				"Chevrolet, Camaro, 2023, 52000",
				"Honda, Civic, 2022, 25000"})
	void testToString(String marca, String modelo, int año, int precio) {
		String result = "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", precio=" + precio + "]";
		Coche coche1 = new Coche(marca, modelo, año, precio);
		assertEquals(result, coche1.toString());
	}

}