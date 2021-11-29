package es.iestriana.poo.datos;

public class Coche {
	
	private Motor motor;
	private String marca;
	private String modelo;
	private double precioAverias;
	public Coche(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = new Motor();
	}
	public Motor getMotor() {
		return motor;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getPrecioAverias() {
		return precioAverias;
	}
	
	public void acumularAverias(double importe) {
		this.precioAverias += importe;
	}
}
