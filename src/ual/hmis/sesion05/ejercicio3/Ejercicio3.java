package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	public String enmascarado(String passw) {

		if (passw.length() < 5)
			return "Password demasiado corto";
		else if (passw.length() >= 5 && passw.length() <= 8)
			return "********";
		else if (passw.length() >= 12 && passw.length() <= 40)
			return "************";
		else if (passw.length() > 40)
			return "Password demasiado largo";
		else
			return "";
	}
}