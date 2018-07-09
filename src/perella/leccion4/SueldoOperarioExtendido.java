package perella.leccion4;

import java.util.Scanner;

public class SueldoOperarioExtendido {
	
	public static void main(String[] args) {
		//Punto 4 y 6
		//https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=4&codigo=77&inicio=0
		//https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=10&codigo=83&inicio=0
		
		
		Scanner teclado=new Scanner(System.in);
		int horasTrabajadas;
		int numEmpleados;
		int empleadoActual=1;
		float costoHora;
		float sueldo;
		float totalSueldos=0;
		float sueldoMedio=0;
		
		System.out.println("**** SUELDO DIARIO DE LOS EMPLEADOS EN EXPLOTADORES S.A ****");
		
		System.out.print("Cuantos empleados?:");
		numEmpleados=teclado.nextInt();
		
		do
		{
			System.out.print("Horas del empleado ("+empleadoActual+"): ");
			horasTrabajadas=teclado.nextInt();
			System.out.print("Precio por Hora:");
			costoHora=teclado.nextFloat();
			sueldo=horasTrabajadas * costoHora;
			System.out.println("Sueldo del empleado:"+sueldo);

			totalSueldos+=sueldo;
			empleadoActual++;
			
		}while(empleadoActual<=numEmpleados);
		
		sueldoMedio = (totalSueldos/numEmpleados);
		System.out.println("Su empresa invierte al dia "+totalSueldos+" en sueldos de empleados");
		System.out.println("El sueldo medio del empleado es de "+sueldoMedio+" en su empresa");
	}	
}


/*

Si hay tiempo y todo va bien:

Aplicar un condicional. Si un empleado trabaja más de 9 horas, todas las subsiguientes serán extras y el precio será por 2.
Aplicar otro condicional. Un empleado no puede trabajar más de 24 horas.



*/