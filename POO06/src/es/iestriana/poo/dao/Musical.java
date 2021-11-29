package es.iestriana.poo.dao;

import es.iestriana.poo.bean.Propiedades;

public interface Musical {

	
		public void añadirCancion(Propiedades a);
		
		public void mostrarCaciones();
		
		public void borrarTodo();
		
		public void borrarCancion(String nombre, String interprete);
		
		public void buscarCacionAnyo(int anyo);
		
		public void buscarCancionGenero(String genero);
		
		public void buscarCancionInterprete(String inter);
		
		public void buscarCancionNom(String nom);
		
		public Propiedades cambiarCal(Propiedades a, int nuevaCal);
		
		public void buscarCancionDur(int inicio, int fin);
		
		public void calcularTiempoTotalLista();
		
		public void calMedia();
}
