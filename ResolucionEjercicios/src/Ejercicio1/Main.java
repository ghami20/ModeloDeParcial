package Ejercicio1;

import java.time.LocalDate;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    //Auto con datos
//    String patente = JOptionPane.showInputDialog("Ingrese patente");
//    VTV corolla = new VTV(patente);
////    COROLLA.SETFECHAVTV();
//    int option= JOptionPane.showConfirmDialog(null, "Ingrese el estado del motor");
//   
////    if (option==0) {
////    	  corolla.setMotor(true);
////	} else {
////  	  corolla.setMotor(false);
////	}
//    
//    corolla.setMotor((option==0)?true:false);
//    
//    
//    JOptionPane.showMessageDialog(null, corolla);
    	
     VTV toyota = new VTV(LocalDate.of(2023, 10, 10),false,false,true,"123abc","corolla");

     VTV mercedes = new VTV(LocalDate.of(2023, 10, 10),true,false,true,"123abc","a250");

     VTV agile = new VTV(LocalDate.of(2023, 10, 10),true,true,true,"123abc","Agile");
     
     VTV lamborgini = new VTV(LocalDate.of(2023, 10, 10),true,true,true,"123abc","lamborgini");
     
     
     VTV generico = new VTV("");
     String[] autos = {"toyota","mercedes","agile","lamborgini"};
     
     int seleciona = JOptionPane.showOptionDialog(null, "seleciona una auto", null, 0, 0, null, autos, autos[0]);
   
   switch (seleciona) {
	case 0:
		generico = toyota;
		break;
	case 1:
		generico = mercedes;
		break;
	case 2:
		generico = agile;
		break;
	case 3:
		generico = lamborgini;
		break;
	
   }
   
     
     String[] menu = {"Ver estado de auto","Realizar vtv","Reparar auto","Salir"};
     int opcion = 0;
     
     JOptionPane.showMessageDialog(null, "Eligio el auto : " +generico);
     do {
    	 opcion =JOptionPane.showOptionDialog(null, "Elija una opción","Menu", JOptionPane.DEFAULT_OPTION, 0, new ImageIcon(Main.class.getResource("/img/mecanico.png")), menu, menu[0]);
    	 switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, generico);
			break;
		case 1:
			generico.realizarVtv();
			break;
		case 2:
			generico.reparar();
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "A bueno adios master", "", JOptionPane.DEFAULT_OPTION , new ImageIcon(Main.class.getResource("/img/adios.gif")));
			break;
		
		}
		
	} while (opcion!=3);
        
        
    }
    
    
}
