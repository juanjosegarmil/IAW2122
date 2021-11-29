package es.iestriana.poo.datos;

import java.util.Random;

public class Profesor {

			public void ponerNotas(Alumno jj) {
				jj.getA1().setCalificacion(new Random().nextFloat()*10);
				jj.getA2().setCalificacion(new Random().nextFloat()*10);
				jj.getA3().setCalificacion(new Random().nextFloat()*10);
			}
			public double calcularMedia(Alumno jj) {
				double cal1 = jj.getA1().getCalificacion();
				double cal2 = jj.getA2().getCalificacion();
				double cal3 = jj.getA3().getCalificacion();
				return (cal1 + cal2 + cal3)/3;
			}
}
