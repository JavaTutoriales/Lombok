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

import java.util.Date;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class GettersSetters {
	private String cadena;
	private int entero;
	@Getter(AccessLevel.NONE)
	@Setter(onParam=@__({@NonNull}))
	private Date fecha;
	private boolean boleano;
}
