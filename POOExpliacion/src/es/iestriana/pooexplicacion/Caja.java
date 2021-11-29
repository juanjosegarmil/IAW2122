package es.iestriana.pooexplicacion;

public class Caja {

	
		//Atributos de la clase
		private double ancho;
		private double alto;
		private double largo;
		
		// Constructor
		public Caja() {
			
		}

		public Caja(double ancho, double alto, double largo) {
			super();
			this.ancho = ancho;
			this.alto = alto;
			this.largo = largo;
		}

		
		
		//metodos get y set
		public double getAncho() {
			return ancho;
		}

		public void setAncho(double ancho) {
			this.ancho = ancho;
		}

		public double getAlto() {
			return alto;
		}

		public void setAlto(double alto) {
			this.alto = alto;
		}
		
		
		
		@Override
		public String toString() {
			return "Caja [ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "]";
		}

		// Métodos
		public double obtenerVolumen() {
			return (ancho * largo * alto);
		}
		
		public boolean equals (Caja aux) {
			if (this.ancho == aux.ancho && this.alto == aux.alto && this.largo == aux.largo) {
				return true;
			}else {
				return false;
			}
		}
}

