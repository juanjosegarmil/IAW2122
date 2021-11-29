package es.iestriana.poo.datos;

import java.util.Objects;

public class Punto {

	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Punto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	public double calcularDistancia(Punto p) {
		double c1 = this.x - p.getX();
		double c2 = this.y - p.getY();
		return Math.sqrt(Math.pow(c1, 2)+ Math.pow(c2, 2));
	}
	
	

}
