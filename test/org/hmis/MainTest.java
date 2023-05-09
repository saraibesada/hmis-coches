package org.hmis;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class MainTest {
	@Test
	void testObjectNotNull() {
		Main main = new Main();

		assertNotEquals(main, null);
	}

	@Test
	void testMain() {
		String filepath = "data/coches.json";
		Coche[] coches = JsonReader.leerCochesJSON(filepath);

		String resultado = "";
		for (Coche coche : coches) {
			resultado = resultado + coche + "\n";
		}

		Main.main(null);
	}

}