package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha fecha = new Fecha();

	@Test
	void CP1() {
		assertFalse(fecha.validarFecha(2023, 2, -5));
	}

	@Test
	void CP2() {
		assertFalse(fecha.validarFecha(2023, -5, 22));
	}

	@Test
	void CP3() {
		assertFalse(fecha.validarFecha(-5, 2, 22));
	}

	@Test
	void CP4() {
		assertFalse(fecha.validarFecha(2023, 13, 22));
	}
}
