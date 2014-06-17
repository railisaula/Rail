import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.midi.Patch;


public class Ejercicios {
	
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		return a+b;
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a-b;
	}
	
	//devuelve la multiplicacion de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a*b;
	}
	
	//devuelve la division de a y b
	static int dividirNumeros(int a, int b)
	{
		return a/b;
	}
	
	//devuelve el primer numero de un archivo
	static int getPrimerNumeroDeArchivo(String path) 
	{
		try
		{
		File file = new File(path);
		Scanner s = new Scanner(file);
		return s.nextInt();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	//devuelve el ultimo numero de un archivo
	static int getUltimoNumeroDeArchivo(String path)
	{
		try
		{
			File file = new File(path);
			Scanner s = new Scanner(file);
			int x = 0;
			while (s.hasNext())
			{
				x=s.nextInt();
//				System.out.print(s);
			}
			return x;
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	
	}
	
	//Suma todos los numeros del archivo
	static int sumarNumerosDeArchivo(String path)
	{
		try
		{
			File file = new File(path);
			Scanner s = new Scanner(file);
			int x = 0;
			while (s.hasNext())
			{
				x+=s.nextInt();
//				System.out.print(s);
			}
			return x;
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;
			
		
	}
	
	//Devuelve true si encuentra un numero en un archivo, de lo contrario devuelve false
	static boolean existeEnArchivo(String path,int num)
	{		
			try
			{
		Scanner scanner = new Scanner(path);
		boolean b = scanner.nextBoolean();
		return b;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			return true;
	}
	
	//Devuelve el numero menor de un archivo
	static int getMenorDeArchivo(String path)
	{
		try
		{
		File file = new File(path);
		Scanner s = new Scanner(file);
		
		return s.nextInt();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;
			
	}
	
	//Devuelve el numero mayor de un archivo
	static int getMayorDeArchivo(String path)
	{
		int x=0;
		try
		{
		File file = new File(path);
		Scanner s = new Scanner(file);
		if (x>=s.nextInt())
		{
			return x;
		}
		
		return s.nextInt();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		
		System.out.println(getPrimerNumeroDeArchivo("Prueba.txt")); 
	}
}
