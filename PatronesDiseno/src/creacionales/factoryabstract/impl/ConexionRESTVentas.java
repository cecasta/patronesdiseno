package creacionales.factoryabstract.impl;

import creacionales.factoryabstract.interfaces.ConexionRESTInterface;

public class ConexionRESTVentas implements ConexionRESTInterface {

	@Override
	public void conectar() {
		System.out.println("Conecto al servicio rest ventas");
		
	}

}
