package creacionales.factoryabstract;

import creacionales.factoryabstract.interfaces.ConexionBDInterface;
import creacionales.factoryabstract.interfaces.ConexionRESTInterface;
import creacionales.factoryabstract.interfaces.FactoryAbstract;

public class Main {
	public static void main(String[] args) {
		FactoryAbstract fabricaBD = FactoryProductor.getFactory("BD");
		ConexionBDInterface cxBD1 = fabricaBD.getBD("MYSQL");
		cxBD1.conectar();
		
		FactoryAbstract fabricaREST = FactoryProductor.getFactory("REST");
		ConexionRESTInterface cxREST1 = fabricaREST.getREST("VENTAS");
		cxREST1.conectar();
		
	}
}
