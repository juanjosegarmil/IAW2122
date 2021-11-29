package es.iestriana.poo.main;

import es.iestriana.poo.bean.Alumno;
import es.iestriana.poo.dao.AlumnoDAO;
import es.iestriana.poo.dao.AlumnoDAOfichero;
import es.iestriana.poo.dao.AlumnoDAOlistas;

public class Principal {

		public static void main(String[] args) {
			AlumnoDAO lista = new AlumnoDAOlistas();
			
			Alumno a1 = new Alumno("yo", "yo yo",23,5.5f);
			Alumno a2 = new Alumno("tu", "tu tu",34,7.5f);
			
			lista.anadir(a1);
			lista.anadir(a2);
			
			lista.mostarTodos();
			Alumno aux = lista.buscarPorEdad(34);
			if(aux != null) {
				System.out.println("Alumno: " +  aux.getNombre() + " encontrado");
			}
			lista.borrar("tu", "tu tu");
			lista.mostarTodos();
		}
}
