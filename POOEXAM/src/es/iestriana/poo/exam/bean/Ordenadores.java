package es.iestriana.poo.exam.bean;

import java.io.Serializable;

public class Ordenadores implements Serializable{
			
	private int id;
	private String marca;
	private int ram;
	private String procesador;
	private int anyocompra;
	private boolean funciona;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getAnyocompra() {
		return anyocompra;
	}
	public void setAnyocompra(int anyocompra) {
		this.anyocompra = anyocompra;
	}
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	@Override
	public String toString() {
		return "Ordenadores [id=" + id + ", marca=" + marca + ", ram=" + ram + ", procesador=" + procesador
				+ ", anyocompra=" + anyocompra + ", funciona=" + funciona + "]";
	}
	public Ordenadores(int id, String marca, int ram, String procesador, int anyocompra, boolean funciona) {
		super();
		this.id = id;
		this.marca = marca;
		this.ram = ram;
		this.procesador = procesador;
		this.anyocompra = anyocompra;
		this.funciona = funciona;
	}
	
	
}
