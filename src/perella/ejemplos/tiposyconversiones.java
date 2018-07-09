package perella.ejemplos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import static java.lang.Math.toIntExact;

public class tiposyconversiones {
	
	public static void main(String[] args) {
		//Tipos de Datos Básicos
		//https://docs.oracle.com/javase/6/docs/api/constant-values.html#java.lang.Integer.MAX_VALUE
		//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#toIntExact-long-
		
		int tipoentero=2147483647;
		long tipoenteroGrande=9223372036854775807L;
		
		float tipodecimal=3.4028234663852886E38f;
		double tipodecimalGrande=1.7976931348623157E308;
		
		String fraseTexto="hola";
		
		System.out.println("-- Límites de Tipos --");
		System.out.println("Tipo Entero De:" + Integer.MIN_VALUE);
		System.out.println("Tipo Entero Hasta:" + Integer.MAX_VALUE);

		System.out.println("Tipo Entero (long) De:" + Long.MIN_VALUE);
		System.out.println("Tipo Entero (long) Hasta:" + Long.MAX_VALUE);

		System.out.printf("Tipo float De: %,f", Float.MIN_VALUE);
		System.out.println("");
		System.out.printf("Tipo float De: %,f", Float.MAX_VALUE);
		System.out.println("");
		
		System.out.printf("Tipo double De: %,f", Double.MIN_VALUE);
		System.out.println("");
		System.out.printf("Tipo double Hasta: %,f", Double.MAX_VALUE);
		System.out.println("");
		
		System.out.println("");
		System.out.println("-- Conversiones --");
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un long:");
		tipoenteroGrande = teclado.nextLong();
		try
		{
			int entero = Math.toIntExact(tipoenteroGrande);
			System.out.println("Entero Grande convertido a entero: "+entero);
			
		}catch(ArithmeticException e)
		{
			System.out.println("Demasiado grande, no se puede convertir!");
		}
		
	}

}
