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

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class EjemploEqualsHashcode {
	private long id;
	private String matricula;
	
	@EqualsAndHashCode.Exclude
	private String nombre;
}
