package es.iestriana.poo.main;

import es.iestriana.poo.bean.Propiedades;
import es.iestriana.poo.dao.Musical;
import es.iestriana.poo.dao.Musical2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Musical lista = new Musical2();
		
		Propiedades p1 = new Propiedades("5 sinfonia", "juanjo", 120, 2020, "opera"); 
		Propiedades p2 = new Propiedades("6 sinfonia", "pepe", 300, 2021, "pop"); 
		Propiedades p3 = new Propiedades("7 sinfonia", "paco", 400, 2000, "flamenco"); 
		Propiedades p4 = new Propiedades("9 sinfonia", "rosa", 60, 1989, "rap"); 
		lista.añadirCancion(p1);
		lista.añadirCancion(p2);
		lista.añadirCancion(p3);
		lista.añadirCancion(p4);
		lista.mostrarCaciones();
		lista.borrarCancion("5 sinfonia", "juanjo");
		lista.mostrarCaciones();
		lista.buscarCacionAnyo(2021);
		lista.buscarCancionGenero("flamenco");
		lista.buscarCancionInterprete("pepe");
		lista.buscarCancionNom("7 sinfonia");
		lista.cambiarCal(p4, 5);
		lista.buscarCancionDur(100, 120);
		lista.calcularTiempoTotalLista();
		lista.calMedia();
		lista.borrarTodo();
	}

}
