

package principal;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import rover.*;



public class inicio {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	 try {

			List<rover> Listarover = new ArrayList<rover>(); 
			rover objRover;
			
			String limites[] = sc.nextLine().toString().split("\\ ");  
			Limite.x = Integer.parseInt(limites[0]);
			Limite.y = Integer.parseInt(limites[1]);
			
			for(int i=0; i<2; i++){
				String entradas[] = sc.nextLine().toString().split("\\ ");
				objRover = new rover(new coordenadas(Integer.parseInt(entradas[0]),
						Integer.parseInt(entradas[1]), entradas[2].toUpperCase().charAt(0)));
			
				objRover.setComandos(sc.nextLine().replace(" ", "").toUpperCase());
				Listarover.add(objRover);
				objRover.iniciar();

			}			
			
			for(rover rover : Listarover){	
				System.out.println(rover);
			}
	
	} catch (Exception e) {
		System.out.println("Erro: " + e.getMessage());
	}		
		
}
			
		
	}
	
	
	

