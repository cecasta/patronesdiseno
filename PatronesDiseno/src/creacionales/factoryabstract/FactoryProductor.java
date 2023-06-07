package creacionales.factoryabstract;

import creacionales.factoryabstract.interfaces.FactoryAbstract;

public class FactoryProductor {
	
	public static FactoryAbstract getFactory(String tipoFabrica) {
		if(tipoFabrica.equals("BD"))
			return new ConexionBDFactory();
		if(tipoFabrica.equals("REST"))
			return new ConexionRESTFactory();
		
		return null;
	}

}
