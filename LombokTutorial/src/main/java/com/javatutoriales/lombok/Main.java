/* 
 * Clase Java desarrollada por Alex para el blog Java Tutoriales (javatutoriales.com) el día 24-feb-2019
 * 
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * programadorjavablog@gmail.com
 * 
 * Para ver el tutorial completo consulta https://www.javatutoriales.com/2019/03/lombok-escribiendo-menos-codigo-y.html
 * 
 * No olvides hacerte fan de Java Tutoriales en facebook https://www.facebook.com/JavaTutoriales/ y seguirme en Twitter: https://twitter.com/JavaTutoriales
 * 
*/

package com.javatutoriales.lombok;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
		//Pueba de @NonNull
		EjemploNonNull nonNull = new EjemploNonNull();
		System.out.format("%s\n\n", nonNull.saluda(null));
		
		
		//Prueba de @Getter y @Setter		
		GettersSetters getSet = new GettersSetters();
		getSet.setCadena("ABC123");
		String valor = getSet.getCadena();
		
		System.out.format("El valor del atributo cadena es: %s", valor);
		
		
		//Prueba de @RequiredArgsConstructor y @AllArgsConstructor
		
		//Constructores constructoresRequired = new Constructores("cadenaFinal", 10);
		Constructores constructoresRequired = Constructores.getInstance("cadenaFinal", 10);
		System.out.format("getCadenaFinal: %s\n", constructoresRequired.getCadenaFinal());
		System.out.format("getEnteroFinal: %d\n\n", constructoresRequired.getEnteroFinal());
		
		Constructores constructoresAllArgs = new Constructores("cadena", 1, "cadenaFinal", 2);
		System.out.format("getCadena: %s\n", constructoresAllArgs.getCadena());
		System.out.format("getEntero: %d\n", constructoresAllArgs.getEntero());
		System.out.format("getCadenaFinal: %s\n", constructoresAllArgs.getCadenaFinal());
		System.out.format("getEnteroFinal: %d\n", constructoresAllArgs.getEnteroFinal());
		
		
		
		//Prueba de @ToString
		EjemploToString ejemploToString = new EjemploToString("cadena", 'c', 1, null, true, new String[]{"uno", "dos", "tres"});
		System.out.format("toString: %s\n\n", ejemploToString);
		

		//Prueba de @EqualsAndHashCode
		EjemploEqualsHashcode instancia1 = new EjemploEqualsHashcode(2, "ABC123", "Alex");
		EjemploEqualsHashcode instancia2 = new EjemploEqualsHashcode(2, "ABC123", "Juan");
				
		System.out.printf("Las instancias son iguales?: %b\n", instancia1.equals(instancia2));
		System.out.printf("Hash de la instancia 1: %h\n", instancia1.hashCode());
		System.out.printf("Hash de la instancia 2: %h\n", instancia2.hashCode());
		
		Set<EjemploEqualsHashcode> set = new HashSet<>();
		set.add(instancia1);
		set.add(instancia2);
		
		System.out.printf("Los objetos del set son: %d, %s\n\n", set.size(), set);
		
		
		//Prueba de @Data
		EjemploData ejemploData1 = new EjemploData("cadena", 1);
		EjemploData ejemploData2 = new EjemploData("cadena", 1);
		
		System.out.format("getCadena: %s\n", ejemploData1.getCadena());
		System.out.format("getCadena: %s\n", ejemploData2.getCadena());
		System.out.printf("Las instancias son iguales?: %b\n", ejemploData1.equals(ejemploData2));
		System.out.printf("Valores: %s\n\n", ejemploData1);
		
	}
	
}

