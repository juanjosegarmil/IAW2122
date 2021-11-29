package es.iestriana.poo.datos;

public class Alumno {

			private Asignatura a1;
			private Asignatura a2;
			private Asignatura a3;
			public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
				super();
				this.a1 = a1;
				this.a2 = a2;
				this.a3 = a3;
			}
			
			public Alumno(int p, int c, int j) {
				this.a1 = new Asignatura(p);
				this.a2 = new Asignatura(c);
				this.a3 = new Asignatura(j);
			}

			public Asignatura getA1() {
				return a1;
			}


			public Asignatura getA2() {
				return a2;
			}

			

			public Asignatura getA3() {
				return a3;
			}

			@Override
			public String toString() {
				return "Alumno [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + "]";
			}

			
}
