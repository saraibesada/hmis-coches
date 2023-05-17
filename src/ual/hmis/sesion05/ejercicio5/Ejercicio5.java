package ual.hmis.sesion05.ejercicio5;

import java.util.*;

public class Ejercicio5 {
	
	public <T extends Comparable<T>> Set<T> fusionConj(Set<T> conj1, Set<T> conj2) {
		if (conj1.isEmpty())
			if (conj2.isEmpty()) return new TreeSet<T>();
			else return conj2;
		else if (conj2.isEmpty())
			return conj1;
        Set<T> conjFusion = new TreeSet<>();
        Iterator<T> iter1 = conj1.iterator();
        Iterator<T> iter2 = conj2.iterator();
        T dato1 = null, dato2 = null;

        while ((iter1.hasNext() || dato1 != null) && (iter2.hasNext() || dato2 != null)) {
            if (dato1 == null && iter1.hasNext())
             	dato1 = iter1.next();

            if (dato2 == null && iter2.hasNext())
                dato2 = iter2.next();
            if (dato1 != null && dato2 != null) {
                if (dato1.compareTo(dato2) < 0) {
                    conjFusion.add(dato1);
                    dato1 = null;
                } else if (dato1.compareTo(dato2) > 0) {
                    conjFusion.add(dato2);
                    dato2 = null;
                } else {
                    conjFusion.add(dato1);
                    dato1 = null;
                    dato2 = null;
                }
            }
        }
        while (iter1.hasNext() || dato1 != null) {
            if (dato1 == null && iter1.hasNext())
                dato1 = iter1.next();
            if (dato1 != null) {
                conjFusion.add(dato1);
                dato1 = null;
            }
        }
        while (iter2.hasNext() || dato2 != null) {
            if (dato2 == null && iter2.hasNext())
                dato2 = iter2.next();
            if (dato2 != null) {
                conjFusion.add(dato2);
                dato2 = null;
            }
        }
        return conjFusion;
	}
}