package examen;

/**
 * La clase "Fecha" representa a una fecha que es evaluada para determinar si es
 * valida en la vida real.
 * 
 * @author Pablo Diaz (daw104)
 * @version 1.0
 */
public class Fecha {
	/**
	 * El valor de la variable "fechaValida" nos servira para conocer si una fecha
	 * es valida (true) o invalida (false).
	 */
	public static boolean fechaValida;

	/**
	 * El metodo "validarFecha" comprueba si una fecha (especificada en sus
	 * parametros: año, mes y dia) es valida en la vida real.
	 * 
	 * @param anio es el año de la fecha a validar.
	 * @param mes  es el mes de la fecha a validar.
	 * @param dia  es el dia de la fecha a validar.
	 * @return devuelve si la fecha especificada en los parámetros es valida (true)
	 *         o no (false).
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}