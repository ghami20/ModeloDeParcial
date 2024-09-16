package Ejercicio2;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;




public class Main {

	    public static void main(String[] args) {
			
	    	
	    	Proyecto nuevo = new Proyecto();
	    	    //
	    	     
	    	     String[] menu = {"Crear proyecto","Agregar etapa","Revisr proyecto","Ver etapas","Salir"};
	    	     int opcion = 0;
	    	     do {
	    	    	 opcion =JOptionPane.showOptionDialog(null, "Elija una opción","Menu", JOptionPane.DEFAULT_OPTION, 0, new ImageIcon(Main.class.getResource("/img/conts.png")), menu, menu[0]);
	    	    	 switch (opcion) {
	    			case 0:
	    				if (nuevo.getNombre().equals("No asignado")) {
							JOptionPane.showMessageDialog(null, "Creando proyecto");
							nuevo.crearProyecto();
						} else {
							JOptionPane.showMessageDialog(null, "El proyecto ya esta creado");
						}
	    				
	    				break;
	    			case 1:
	    				if (nuevo.getNombre().equals("No asignado")) {
							JOptionPane.showMessageDialog(null, "Todavía no se creó un proyecto");
						} else {
		    				nuevo.agregarEtapa();
						}
	    				
	    	 
	    				break;
	    			case 2:
	    				if (nuevo.getNombre().equals("No asignado")) {
							JOptionPane.showMessageDialog(null, "Todavía no se creó un proyecto");
						} else {
		    				JOptionPane.showMessageDialog(null, nuevo);
						}
	    				
	    	 
		    				
	    				break;
	    			case 3:
	    				if (nuevo.getNombre().equals("No asignado")) {
							JOptionPane.showMessageDialog(null, "Todavía no se creó un proyecto");
						} else {
		    				JOptionPane.showMessageDialog(null, nuevo.getEtapas());
						}	    				break;
	    			
	    			case 4:
	    				JOptionPane.showMessageDialog(null, "A bueno adios master", "", JOptionPane.DEFAULT_OPTION , new ImageIcon(Main.class.getResource("/img/adios.gif")));
	    				break;
	    			}
	    			
	    		} while (opcion!=4);
	    	        
	    	
		}
	}

