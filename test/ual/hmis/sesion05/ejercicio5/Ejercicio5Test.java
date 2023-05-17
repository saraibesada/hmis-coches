package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class Ejercicio5Test {
	@Test
	void testObjectNotNull() {
		Ejercicio5 ejercicio5 = new Ejercicio5();
		assertNotEquals(ejercicio5, null);
	}

	@ParameterizedTest  
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjEmpty.csv")
	void testFirstConjEmpty(String conjCSV) {

		Ejercicio5 ejercicio5 = new Ejercicio5();

	      Set<String> conj1 = new TreeSet<>();
	      Set<String> conj2 = new TreeSet<>();
	      
	      for (String s : conjCSV.split(", ")) {
	        	conj2.add(s);
	        }
	      
	  	assertArrayEquals(conj2.toArray(), ejercicio5.fusionConj(conj1, conj2).toArray());
	  	}

	  	@ParameterizedTest
	  	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjEmpty.csv")
	  	void testSecondConjEmpty(String conjCSV) {
			Ejercicio5 ejercicio5 = new Ejercicio5();
			
			Set<String> conj1 = new TreeSet<>();   
			Set<String> conj2 = new TreeSet<>();

		        for (String s : conjCSV.split(", ")) {
		        	conj1.add(s);
		        }

				assertArrayEquals(conj1.toArray(), ejercicio5.fusionConj(conj1, conj2).toArray());
			}

			@Test
			void testConjEmpty() {

				Ejercicio5 ejercicio5 = new Ejercicio5();

		        Set<Integer> conj1 = new TreeSet<>();
		        Set<Integer> conj2 = new TreeSet<>();
		        Set<Integer> conjFusion = new TreeSet<>();
		        
		    	assertArrayEquals(conjFusion.toArray(), ejercicio5.fusionConj(conj1, conj2).toArray());
			}

				Set<Integer> daFormatoConjInt(String conjCSV) {

		        Set<Integer> conj = new TreeSet<>();

		        for (String s : conjCSV.split(", ")) {
		        	conj.add(Integer.parseInt(s));
		        }

				return conj;
			}

			@ParameterizedTest
			@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjInt.csv")
			void testFusionConjInt(String conjCSV) {

				Ejercicio5 ejercicio5 = new Ejercicio5();

		        String[] arrayConjCSV = conjCSV.split("; ");

		        Set<Integer> conj1 = daFormatoConjInt(arrayConjCSV[0]);
		        Set<Integer> conj2 = daFormatoConjInt(arrayConjCSV[1]);
		        Set<Integer> conjFusion = daFormatoConjInt(arrayConjCSV[2]);
		        
				assertArrayEquals(conjFusion.toArray(), ejercicio5.fusionConj(conj1, conj2).toArray());
			}

				Set<Double> daFormatoConjDouble(String conjCSV) {

		        Set<Double> conj = new TreeSet<>();

		        for (String s : conjCSV.split(", ")) {
		        	conj.add(Double.parseDouble(s));
		        }

		    	return conj;
				}

				@ParameterizedTest
				@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjDouble.csv")
				void testFusionConjDouble(String conjCSV) {

					Ejercicio5 ejercicio5 = new Ejercicio5();

			        String[] arrayConjCSV = conjCSV.split("; ");

			        Set<Double> conj1 = daFormatoConjDouble(arrayConjCSV[0]);
			        Set<Double> conj2 = daFormatoConjDouble(arrayConjCSV[1]);
			        Set<Double> conjFusion = daFormatoConjDouble(arrayConjCSV[2]);

					assertArrayEquals(conjFusion.toArray(), ejercicio5.fusionConj(conj1, conj2).toArray());
				}

				Set<String> daFormatoConjString(String conjCSV) {

			    Set<String> conj = new TreeSet<>();
			    
			    for (String s : conjCSV.split(", ")) {
		        	conj.add(s);
		        }

				return conj;
			}

			@ParameterizedTest
			@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjString.csv")
			void testFusionConjString(String conjCSV) {

				Ejercicio5 ejercicio5 = new Ejercicio5();

		        String[] arrayConjCSV = conjCSV.split("; ");

		        Set<String> conj1 = daFormatoConjString(arrayConjCSV[0]);
		        Set<String> conj2 = daFormatoConjString(arrayConjCSV[1]);
		        Set<String> conjFusion = daFormatoConjString(arrayConjCSV[2]);

				assertArrayEquals(conjFusion.toArray(), ejercicio5.fusionConj(conj1, conj2).toArray());
			}

		}
			    
