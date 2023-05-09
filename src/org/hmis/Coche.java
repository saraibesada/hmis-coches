package org.hmis;

import java.util.Objects;

public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private int precio;

    // Constructor por defecto
    public Coche() {}

    
    
    public Coche(String marca, String modelo, int año, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
	}


	// Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return año == other.año && 
				Objects.equals(marca, other.marca) && 
				Objects.equals(modelo, other.modelo) && 
				precio == other.precio;
	}



	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", precio=" + precio + "]";
	}
	
	
    
}