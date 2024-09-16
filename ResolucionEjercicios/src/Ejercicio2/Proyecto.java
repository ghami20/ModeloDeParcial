package Ejercicio2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Proyecto {

	// Atributos del proyecto
	private String nombre;
	private String ubicacion;
	private String cliente;
	private LocalDate fechaInicio;
	private LocalDate fechaProgreso;
	private String etapas;

	// Constructor
	public Proyecto(String nombre, String ubicacion, String cliente, LocalDate fechaInicio) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.cliente = cliente;
		this.fechaInicio = fechaInicio;
		this.etapas = "Etapas:";
		this.fechaProgreso = fechaInicio;
	}

	public Proyecto() {
		this.nombre = "No asignado";
		this.ubicacion = "No asignado";
		this.cliente = "No asignado";
		this.fechaInicio = LocalDate.now();
		this.etapas = "Etapas:";
		this.fechaProgreso = LocalDate.now();
	}
	// Get y Set

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaProgreso() {
		return fechaProgreso;
	}

	public void setFechaProgreso(LocalDate fechaProgreso) {
		this.fechaProgreso = fechaProgreso;
	}

	public String getEtapas() {
		return etapas;
	}

	public void setEtapas(String etapas) {
		this.etapas = etapas;
	}

	// Metodos
	public void crearProyecto() {
		this.nombre = validarCaracteres("Ingrese el nombre del proyecto");
		this.cliente = validarCaracteres("Ingrese el nombre del cliente");
		this.ubicacion = validarCaracteres("Ingrese la ubicación del proyecto");
		this.fechaInicio = LocalDate.of(validarNumeros("Ingrese año"), validarNumeros("Ingrese mes"), validarNumeros("Ingrese día"));
		this.fechaProgreso = this.fechaInicio ; 
	}
	public void agregarEtapa() {

		String etapa = validarCaracteres("Ingrese nombre de etapa");
		int calificacion = IngrsarCalificacion(etapa);
		fechaProgreso = fechaProgreso.plusDays(1);
		this.etapas = this.etapas + "\nEtapa " + etapa + " Califiación: " + calificacion + " Fecha " + fechaProgreso;

	}
	
	public int validarNumeros(String mensaje) {
		boolean flag ;
		String num ="" ;
		do {
			flag =true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
		
		return Integer.parseInt(num);
	}
	
	public String validarCaracteres(String mensaej) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaej);
		}
		return palabra;
	}

	public int IngrsarCalificacion(String etapa) {
		String[] calificacion = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		int elegida = JOptionPane.showOptionDialog(null, "Califique la etapa :" + etapa, "", 0, 0, null, calificacion,
				calificacion[0]);
		return elegida + 1;
	}

	@Override
	public String toString() {
		return "Proyecto [nombre=" + nombre + ", ubicacion=" + ubicacion + ", cliente=" + cliente + ", fechaInicio="
				+ fechaInicio + ", fechaProgreso=" + fechaProgreso + ", etapas=" + etapas + "]";
	}

	
}
