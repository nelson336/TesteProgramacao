package test;

import org.junit.Test;

import junit.framework.Assert;
import rover.Limite;
import rover.coordenadas;
import rover.rover;

@SuppressWarnings("deprecation")
public class Testes {

	
	@Test
	public void test() {
		
		rover objRover1, objRover2 ;
		  
		Limite.x = 5;
		Limite.y = 5;
	
		objRover1 = new rover(new coordenadas(1, 2, 'N'));
		objRover1.setComandos("LMLMLMLMM");
		objRover1.iniciar();
		
		objRover2 = new rover(new coordenadas(3, 3, 'E'));
		objRover2.setComandos("MMRMMRMRRM");
		objRover2.iniciar();
		
		Assert.assertEquals("1 3 N", objRover1.toString());
		Assert.assertEquals("5 1 E", objRover2.toString());
		
	}

}
