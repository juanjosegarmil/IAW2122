package es.iestriana.poo.datos;

import java.util.Objects;

public class Cuentas {
				
				private String nombre;
				private String ccc;
				private double saldo;
				private double tipoDeInteres;
				public Cuentas() {
					super();
					// TODO Auto-generated constructor stub
				}
				public Cuentas(String nombre, String ccc, double saldo, double tipoDeInteres) {
					super();
					this.nombre = nombre;
					this.ccc = ccc;
					this.saldo = saldo;
					this.tipoDeInteres = tipoDeInteres;
				}
				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Cuentas other = (Cuentas) obj;
					return Objects.equals(ccc, other.ccc) && Objects.equals(nombre, other.nombre)
							&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo)
							&& Double.doubleToLongBits(tipoDeInteres) == Double.doubleToLongBits(other.tipoDeInteres);
				}
				@Override
				public String toString() {
					return "Cuentas [nombre=" + nombre + ", ccc=" + ccc + ", saldo=" + saldo + ", tipoDeInteres="
							+ tipoDeInteres + "]";
				}
				public String getNombre() {
					return nombre;
				}
				public void setNombre(String nombre) {
					this.nombre = nombre;
				}
				public String getCcc() {
					return ccc;
				}
				public void setCcc(String ccc) {
					this.ccc = ccc;
				}
				public double getSaldo() {
					return saldo;
				}
				public void setSaldo(double saldo) {
					this.saldo = saldo;
				}
				public double getTipoDeInteres() {
					return tipoDeInteres;
				}
				public void setTipoDeInteres(double tipoDeInteres) {
					this.tipoDeInteres = tipoDeInteres;
				}
				
				public void ingresar(double cantidad) {
					if (cantidad >0) {
						saldo += cantidad;
					}
				}
				public void reintegro(double cantidad) {
					if(cantidad > 0 && cantidad <= saldo) {
						saldo -= cantidad;
					}
				}
				
}
