package es.iestriana.poo.exam.main;

import es.iestriana.poo.exam.bean.Ordenadores;
import es.iestriana.poo.exam.dao.Ordenadoresint;
import es.iestriana.poo.exam.dao.Ordenadoresint2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenadoresint lista = new Ordenadoresint2();
		
		Ordenadores o1 = new Ordenadores(1, "hp", 8, "intel", 2019, true);
		Ordenadores o2 = new Ordenadores(2, "asus", 512, "intel", 2017, true);
		Ordenadores o3 = new Ordenadores(3, "acer", 6, "intel", 2016, true);
		Ordenadores o4 = new Ordenadores(4, "lenovo", 12, "intel", 2014, false);
		Ordenadores o5 = new Ordenadores(5, "acer", 24, "intel", 2017, false);
		Ordenadores o6 = new Ordenadores(6, "hp", 512, "intel", 2020, false);
		
		lista.añadirOrdenador(o1);
		lista.añadirOrdenador(o2);
		lista.añadirOrdenador(o3);
		lista.añadirOrdenador(o4);
		lista.añadirOrdenador(o5);
		lista.añadirOrdenador(o6);
		lista.buscarOrdenador("hp", 8, "intel");
		lista.buscarRamEstado(8);
		lista.actualizarRam(12);
		lista.listarOrdenadores();
		lista.borrarOrdenadores();
		lista.borrarOrdenadoresAnyo();
		
	}

}
