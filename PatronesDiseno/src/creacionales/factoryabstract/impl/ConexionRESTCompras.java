package creacionales.factoryabstract.impl;

import creacionales.factoryabstract.interfaces.ConexionRESTInterface;

public class ConexionRESTCompras implements ConexionRESTInterface {

	@Override
	public void conectar() {
		System.out.println("Conecto al servicio rest Compras");
		
	}

}
