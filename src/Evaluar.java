import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {


	@Test
	public void testSumarNumeros()
	{
		assertEquals("10 + 20 deberia ser igual a 30", 30, Ejercicios.sumarNumeros(10,20));
		assertEquals("100 + 230 deberia ser igual a 330", 330, Ejercicios.sumarNumeros(100,230));
		assertEquals("-5 + 10 deberia ser igual a 5", 5, Ejercicios.sumarNumeros(-5,10));
		assertEquals("22 + 11 deberia ser igual a 11", 11, Ejercicios.sumarNumeros(22,-11));
	}
	
	@Test
	public void testRestarNumeros()
	{
		assertEquals("50 - 40 deberia ser igual a 10", 10, Ejercicios.restarNumeros(50,40));
		assertEquals("27 - 5 deberia ser igual a 22", 22, Ejercicios.restarNumeros(27,5));
		assertEquals("-5 - 10 deberia ser igual a -15", -15, Ejercicios.restarNumeros(-5,10));
		assertEquals("22 - 11 deberia ser igual a 33", 11, Ejercicios.restarNumeros(22,11));
	}
	
	@Test
	public void testMultiplicarNumeros()
	{
		assertEquals("4 * 4 deberia ser igual a 16", 16, Ejercicios.multiplicarNumeros(4,4));
		assertEquals("3 * 2 deberia ser igual a 6", 6, Ejercicios.multiplicarNumeros(3,2));
		assertEquals("7 * 3 deberia ser igual a 21", 21, Ejercicios.multiplicarNumeros(7,3));
		assertEquals("8 * 2 deberia ser igual a 16", 16, Ejercicios.multiplicarNumeros(8,2));
	}
	
	@Test
	public void testDividirNumeros()
	{
		assertEquals("4 / 4 deberia ser igual a 1", 1, Ejercicios.dividirNumeros(4,4));
		assertEquals("6 / 2 deberia ser igual a 3", 3, Ejercicios.dividirNumeros(6,2));
		assertEquals("21 / 7 deberia ser igual a 3", 3, Ejercicios.dividirNumeros(21,7));
		assertEquals("8 / 2 deberia ser igual a 4", 4, Ejercicios.dividirNumeros(8,2));
	}
	
	@Test
	public void testGetPrimerNumeroDeArchivo()
	{
		assertEquals("Fallo en el archivo NoBorrarNiModificar1 el ultimo deberia ser 10", 10, Ejercicios.getPrimerNumeroDeArchivo("NoBorrarNiModificar1"));
	}
	
	@Test
	public void testGetUltimoNumeroDeArchivo()
	{
		assertEquals("Fallo en el archivo NoBorrarNiModificar1 el ultimo deberia ser 50", 50, Ejercicios.getUltimoNumeroDeArchivo("NoBorrarNiModificar1"));
	}
	
	@Test
	public void testSumarNumerosDeArchivo()
	{
		assertEquals("Fallo en el archivo NoBorrarNiModificar1 la suma deberia ser 150", 150, Ejercicios.sumarNumerosDeArchivo("NoBorrarNiModificar1"));
	}
	
	@Test
	public void testExisteEnArchivo()
	{
		assertEquals("Fallo en el archivo NoBorrarNiModificar1 30 si existe en el archivo", true, Ejercicios.existeEnArchivo("NoBorrarNiModificar1",30));
	}
	
	@Test
	public void testGetMenorDeArchivo()
	{
		assertEquals("Fallo en el archivo NoBorrarNiModificar1 10 deberia ser el menor", 10, Ejercicios.getMenorDeArchivo("NoBorrarNiModificar1"));
	}
	
	@Test
	public void testGetMayorDeArchivo()
	{
		assertEquals("Fallo en el archivo NoBorrarNiModificar1 50 deberia ser el mayor", 50, Ejercicios.getMayorDeArchivo("NoBorrarNiModificar1"));
	}

}
