package es.iestriana.poo.bean;

import java.io.Serializable;

public class Propiedades implements Serializable{

		private String nombre;
		private String interprete;
		private int duracion;
		private int anyo;
		private String genero;
		private int numderepro;
		private int calificacion;
		private boolean reproducir;
		@Override
		public String toString() {
			return "Propiedades [nombre=" + nombre + ", interprete=" + interprete + ", duracion=" + duracion + ", anyo="
					+ anyo + ", genero=" + genero + ", numderepro=" + numderepro + ", calificacion=" + calificacion
					+ ", reproducir=" + reproducir + "]";
		}
		public Propiedades(String nombre, String interprete, int duracion, int anyo, String genero) {
			super();
			this.nombre = nombre;
			this.interprete = interprete;
			this.duracion = duracion;
			this.anyo = anyo;
			this.genero = genero;
			this.numderepro = 0;
			this.calificacion = 0;
			this.reproducir = true;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getInterprete() {
			return interprete;
		}
		public void setInterprete(String interprete) {
			this.interprete = interprete;
		}
		public int getDuracion() {
			return duracion;
		}
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
		public int getAnyo() {
			return anyo;
		}
		public void setAnyo(int anyo) {
			this.anyo = anyo;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public int getNumderepro() {
			return numderepro;
		}
		public void setNumderepro(int numderepro) {
			this.numderepro = numderepro;
		}
		public int getCalificacion() {
			return calificacion;
		}
		public void setCalificacion(int calificacion) {
			this.calificacion = calificacion;
		}
		public boolean isReproducir() {
			return reproducir;
		}
		public void setReproducir(boolean reproducir) {
			this.reproducir = reproducir;
		}
		
		
}
