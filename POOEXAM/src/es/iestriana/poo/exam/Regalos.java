package es.iestriana.poo.exam;

import java.util.Objects;

public class Regalos {

	private String nombre;
	private String marca;
	private int anyocompra;
	private double precio;
	private boolean existen;
	private String tipo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnyocompra() {
		return anyocompra;
	}
	public void setAnyocompra(int anyocompra) {
		this.anyocompra = anyocompra;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isExisten() {
		return existen;
	}
	public void setExisten(boolean existen) {
		this.existen = existen;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Regalos(String nombre, String marca, int anyocompra, int precio, boolean existen, String tipo) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.anyocompra = anyocompra;
		this.precio = precio;
		this.existen = existen;
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Regalos [nombre=" + nombre + ", marca=" + marca + ", anyocompra=" + anyocompra + ", precio=" + precio
				+ ", existen=" + existen + ", tipo=" + tipo + "]";
	}
	public void cambiarExistencias () {
		this.existen = !this.existen;
	}
	public void incrementarPrecio(Regalos a, double porcentaje) {
		double num = 0;	
		num = a.getPrecio();
		a.setPrecio((num*porcentaje)+num);
	}
	public void cambiarTipo(Regalos a, String tipo) {
		a.setTipo(tipo);
	}
	public boolean comprobarRegalo (Regalos a) {
		if (a.getTipo().equalsIgnoreCase("coche") & a.getAnyocompra() == 2021 & a.getPrecio() > 50) {
			return true;
		}else {
			return false;
		}
			
	}
}
