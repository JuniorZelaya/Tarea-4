package junior;
public class Ejercicios {
	
	static char[] arreglo = {'z','a','c'};
	
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		return arreglo[posicion];
	}
	
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		return arreglo[posicion];
	}
	
	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	{
		int suma = 0;
		
		for(int a = 0; a < arreglo.length; a++)
		{
			suma = suma + arreglo[a];
		}
		
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
		int suma = 0;
		int cuantidadDeNumeros = arreglo.length;
		
		for(int a = 0; a < arreglo.length; a++)
		{
			suma = suma + arreglo[a];
		}
		
		return suma / cuantidadDeNumeros;
	}
	
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{
		for(int a = 0; a < arreglo.length; a++)
		{
			if(arreglo[a] == valor)
			{
				return true;
			}
		}
		
		return false;
	}
		
	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
		for(int a = 0; a < arreglo.length; a++)
		{
			if(arreglo[a].equals(valor))
			{
				return true;
			}
		}
		
		return false;
	}
}
