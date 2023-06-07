package creacionales.factoryabstract;


import creacionales.factoryabstract.impl.ConexionRESTCompras;
import creacionales.factoryabstract.impl.ConexionRESTVentas;
import creacionales.factoryabstract.interfaces.ConexionBDInterface;
import creacionales.factoryabstract.interfaces.ConexionRESTInterface;
import creacionales.factoryabstract.interfaces.FactoryAbstract;

public class ConexionRESTFactory implements FactoryAbstract {
	


	@Override
	public ConexionBDInterface getBD(String motor) {
		return null;
	}

	@Override
	public ConexionRESTInterface getREST(String area) {
		if(area == null)
			return null;
		
		if(area.equals("VENTAS"))
			return new ConexionRESTVentas();
		
		if(area.equals("COMPRAS"))
			return new ConexionRESTCompras();
		
		return null;
	}

}
