package es.iestriana.poo.dao;

import java.util.ArrayList;
import java.util.List;

import es.iestriana.poo.bean.Propiedades;

public class Musical2 implements Musical{

	private List<Propiedades> musical = new ArrayList<Propiedades>();
	@Override
	public void añadirCancion(Propiedades a) {
		musical.add(a);
		
	}

	@Override
	public void mostrarCaciones() {
		// TODO Auto-generated method stub
		for (Propiedades p : musical) {
			System.out.println(p);
		}
	}

	@Override
	public void borrarTodo() {
		// TODO Auto-generated method stub
		musical.clear();
	}

	@Override
	public void borrarCancion(String nombre, String interprete) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < musical.size(); i++) {
			if (musical.get(i).getNombre().equalsIgnoreCase(nombre) && musical.get(i).getInterprete().equalsIgnoreCase(interprete)) {
				musical.remove(i);
			}
		}
	}

	@Override
	public void buscarCacionAnyo(int anyo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < musical.size(); i++) {
			if (musical.get(i).getAnyo() == anyo) {
				System.out.println(musical.get(i));
			}
		}
	}

	@Override
	public void buscarCancionGenero(String genero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < musical.size(); i++) {
			if (musical.get(i).getGenero().equalsIgnoreCase(genero)) {
				System.out.println(musical.get(i));
			}
		}

	}

	@Override
	public void buscarCancionInterprete(String inter) {
		// TODO Auto-generated method stub
		for (int i = 0; i < musical.size(); i++) {
			if (musical.get(i).getInterprete().equalsIgnoreCase(inter)) {
				System.out.println(musical.get(i));
			}
		}

	}

	@Override
	public void buscarCancionNom(String nom) {
		// TODO Auto-generated method stub
		for (int i = 0; i < musical.size(); i++) {
			if (musical.get(i).getNombre().equalsIgnoreCase(nom)) {
				System.out.println(musical.get(i));
			}
		}

	}

	@Override
	public Propiedades cambiarCal(Propiedades a, int nuevaCal) {
		// TODO Auto-generated method stub
		for (Propiedades p : musical) {
			if (p.equals(a)) {
				p.setCalificacion(nuevaCal);
				return p;
			}
		}
		return null;
	}

	@Override
	public void buscarCancionDur(int inicio, int fin) {
		// TODO Auto-generated method stub
		for (Propiedades p : musical) {
			if (p.getDuracion() >= inicio && p.getDuracion() <= fin) {
				System.out.println(p);
			}
		}
	}

	@Override
	public void calcularTiempoTotalLista() {
		// TODO Auto-generated method stub
		int dur = 0;
		for (Propiedades p : musical) {
			dur += p.getDuracion();
		}
		System.out.println("Duración total:" + dur);
		
	}

	@Override
	public void calMedia() {
		// TODO Auto-generated method stub
		int cal = 0;
		int cont = 0;
		for (Propiedades p : musical) {
			cal += p.getCalificacion();
			cont++;
		}
		int media = cal/cont;
		System.out.println("La media es: " + media);
	}

}
