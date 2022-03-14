package es.iestriana.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Libro implements Serializable{

	private int idLibro;
	private String titulo;
	private String autor;
	private int isbn;
	private byte[] portada;
	private int idUsuario;
	private String uuid;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(int idLibro, String titulo, String autor, int isbn, byte[] portada, int idUsuario, String uuid) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.portada = portada;
		this.idUsuario = idUsuario;
		this.uuid = uuid;
	}

	public Libro(String titulo, String autor, int isbn, byte[] portada, int idUsuario, String uuid) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.portada = portada;
		this.idUsuario = idUsuario;
		this.uuid = uuid;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public byte[] getPortada() {
		return portada;
	}

	public void setPortada(byte[] portada) {
		this.portada = portada;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn
				+ ", idUsuario=" + idUsuario + ", uuid=" + uuid + "]";
	}	
	
}
