package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	public boolean login (String user, String passw){
		// distinto de empty
		if (user.isEmpty()) return false;
		if (passw.isEmpty()) return false;

		// length < 30
		if (user.length() >= 30) return false;
		if (passw.length() >= 30) return false;

		// al menos una minúscula, una mayúscula y un dígito
		boolean contieneMinuscula = false;
		boolean contieneMayuscula = false;
		boolean contieneDigito = false;

		for (char caracter  : passw.toCharArray()) {
			if (Character.isLowerCase(caracter)) contieneMinuscula = true;
			if (Character.isUpperCase(caracter)) contieneMayuscula = true;
			if (Character.isDigit(caracter)) contieneDigito = true;
		}

		if (!contieneMinuscula || !contieneMayuscula || !contieneDigito) return false;
		
		return comprobarUserBD(user, passw);
	}

	public boolean comprobarUserBD (String user, String passw){
	
		if (user.equals("Username") && passw.equals("Password8"))
			return true;
		else
			return false;
	}
}