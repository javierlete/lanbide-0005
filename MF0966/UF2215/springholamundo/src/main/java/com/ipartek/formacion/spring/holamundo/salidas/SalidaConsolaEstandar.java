package com.ipartek.formacion.spring.holamundo.salidas;

public class SalidaConsolaEstandar implements Salida {

	@Override
	public void mostrar(String texto) {
		System.out.println(texto);
	}

}
