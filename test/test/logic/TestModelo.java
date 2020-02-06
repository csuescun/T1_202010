package test.logic;

import static org.junit.Assert.*;
import model.logic.Modelo;

import org.junit.Before;
import org.junit.Test;

import controller.Controller;

public class TestModelo {

	private Modelo modelo;

	@Before
	public void setUp1() 
	{
		modelo= new Modelo();
		modelo.cargarComparendos(Controller.RUTA_DATOS_SMALL);
	}


	@Test
	public void testModelo() {
		assertTrue(modelo!=null);
		assertEquals(20, modelo.darTamano()); 
	}

	@Test
	public void testDarTamano() 
	{
		assertEquals("No corresponde al tamano esperado",20, modelo.darTamano());
	}



	@Test
	public void testBuscar() 
	{
		assertTrue("No encontró el elemento pero este sí existe", modelo.buscar(29042)!=null);
		assertTrue("No encontró el elemento pero este sí existe", modelo.buscar(395366)!=null);
		assertTrue("No encontró el elemento pero este sí existe", modelo.buscar(209146)!=null);
		assertTrue("No encontró el elemento pero este sí existe", modelo.buscar(1)==null);
	}


}
