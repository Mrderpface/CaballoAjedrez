package org.iesalandalus.programacion.caballoajedrez;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {

	
	public void coloresValidosTest() {
		
		Color color;
		color = Color.BLANCO;
		assertEquals(Color.BLANCO, color);
		color = Color.NEGRO;
		assertEquals(Color.NEGRO, color);
	}

}
