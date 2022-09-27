package ej3;

import java.io.File;

//Hacer un programa que liste el contenido del directorio actual y de los directorios que cuelgan de él, 
//mostrando nombre y tipo de cada fichero o directorio

public class Main 
{

	public static void main(String[] args) 
	{
		File path = new File("");
		String directorioActual= path.getAbsolutePath();
		File directorio = new File(directorioActual);
		File[] ficheros = directorio.listFiles();
		for(File f : ficheros)
		{
			System.out.println(f);
		}
	}


}
